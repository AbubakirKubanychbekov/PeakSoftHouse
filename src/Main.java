import dataBase.DataBase;
import exception.MyException;
import model.Group;
import model.Lesson;
import model.Student;
import service.GroupServiceImpl;
import service.LessonServiceImpl;
import service.StudentServiceImpl;
import user.Person;

import java.time.ZonedDateTime;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(10L, "Abubakir", "Kubanychbekov", "abubakir@gmail.com", "1234567", "MALE");
        LinkedList<Student> students = new LinkedList<>(List.of(student1));

        Group group1 = new Group(20l, "Java-10", "BackEnd");
        ArrayList<Group> groups1 = new ArrayList<>(List.of(group1));


        Lesson lesson1 = new Lesson("Set", "unique");
        ArrayList<Lesson> lessons1 = new ArrayList<>(List.of(lesson1));

        Person person = new Person(10L, "Abubakir Kubanychbekov", "abubakir@gmail.com", "1234567");
        ArrayList<Person> people = new ArrayList<>(List.of(person));


        DataBase dataBase = new DataBase(groups1, lessons1, students);
        GroupServiceImpl groupServiceImpl = new GroupServiceImpl(dataBase);
        LessonServiceImpl lessonServiceImpl = new LessonServiceImpl(dataBase);
        StudentServiceImpl studentServiceImpl = new StudentServiceImpl(dataBase);


        Scanner scannerSan = new Scanner(System.in);
        Scanner scannerSoz = new Scanner(System.in);
        zoneGetTime();
        System.out.println(" Катталган болсонуз 1 басыныз, пароль унутуп калып, озгортуу учун 2 басыныз");

        int x;
        while (true) {
            x = scannerSan.nextInt();

            switch (x) {
                case 1: {
                    System.out.println("Кируу учун почтанызды жана паролунузду жазыныз: \n Электрондук почтанызды жазыныз: ");
                    String email = scannerSoz.nextLine();
                    System.out.println("Пароль жазыныз:");
                    String password = scannerSoz.nextLine();
                    if (email.equalsIgnoreCase(person.getEmail()) && password.equalsIgnoreCase(person.getPassword())) {
                        System.out.println("-------------Админ------------");
                        System.out.println(person);
                        System.out.println("------------КОШ КЕЛДИНИЗ!------------");
                        break;
                    } else if (!email.equalsIgnoreCase(person.getEmail()) && !password.equalsIgnoreCase(person.getPassword())) {
                        System.out.println(" Электрондук почта же пароль туура эмес!");
                        System.out.println(" Катталган болсонуз 1 басыныз, пароль унутуп калып, озгортуу учун 2 басыныз");

                    }
                } case 2: {
                    System.out.println(" Электрондук почта же пароль туура эмес!");
                            System.out.print("Пароль озгортуу учун почтанызды жазыныз: ");
                            String email1 = scannerSoz.nextLine();
                            System.out.print("Жаны пароль жазыныз узундугу 7 символдон аз болбосун!: ");
                            String password = scannerSoz.nextLine();
                            try {

                                if (password.length() < 7) {
                                    throw new MyException("Пароль жараксыз!" +
                                            "\n Кайрадан аракет кылып корунуз! ");
                                } else {
                                    System.out.println("Пароль озгорулду ");
                                }
                            } catch (MyException e) {
                                System.out.println(e.getMessage());

                            }
                            System.out.println("Кируу учун почтанызды жана паролунузду жазыныз: \n Электрондук почтанызды жазыныз: ");
                            String email = scannerSoz.nextLine();
                            System.out.println("Пароль жазыныз:");
                            String password1 = scannerSoz.nextLine();
                            System.out.println("-------------Админ------------");
                            System.out.println(person);
                            System.out.println("------------КОШ КЕЛДИНИЗ!------------");
                            if (email.equalsIgnoreCase(person.getEmail()) && password.equalsIgnoreCase(person.getPassword())) {
                                System.out.println("-------------Колдонуучу------------");
                                System.out.println(person);
                                System.out.println("------------КОШ КЕЛДИНИЗ!------------");

                            }
                        }break;
                    }

                 int x3;
                while (true) {
                System.out.println("*** Бир команда танданыз! ***" +
                        "\n1. Add new group" +
                        "\n2. Get group by name" +
                        "\n3. Update group name" +
                        "\n4. Get all groups" +
                        "\n5. Add new student to group" +
                        "\n6. Update student" +
                        "\n7. Find student by first name " +
                        "\n8. Get all students by group name" +
                        "\n9. Get all student's lesson" +
                        "\n10.Delete student " +
                        "\n11.Add new lesson to " +
                        "\n12.Get lesson by name " +
                        "\n13.Get all lesson by group name " +
                        "\n14.Delete lesson " +
                        "\n15.Delete group ");

                x3 = scannerSan.nextInt();
                switch (x3) {
                    case 1: {
                        System.out.println("Кошо турган группанын атын жазыныз:");
                        String groupName = scannerSoz.nextLine();
                        System.out.println("Id син жазыныз: ");
                        long id = scannerSan.nextLong();
                        System.out.println("сүрөттөмө жазуу :");
                        String description = scannerSoz.nextLine();
                        groupServiceImpl.addNewGroup(id, groupName, description);
                        System.out.println("Группа ийгиликтуу кошулду!");
                        break;
                    }
                    case 2: {
                        System.out.println("Таба турган группанын атын жазыныз :");
                        Scanner scanner = new Scanner(System.in);
                        groupServiceImpl.getGroupByName(scanner.nextLine());
                        System.out.println(scanner.nextLine());
                    }
                    case 3: {
                        System.out.println("Алмаштыра турган группанын аты: ");
                        String oldName=scannerSoz.nextLine();
                        System.out.println("Кайсы группага алмаштырасыз: ");
                        String newName=scannerSoz.nextLine();
                        groupServiceImpl.updateGroupName(oldName,newName);


                    }
                    case 4: {
                        groupServiceImpl.getAllGroups(dataBase.getGroups());
                        break;
                    }
                    case 5: {
                        System.out.println("Кайсы группага кошосуз id: ");
                        Long groupId = scannerSan.nextLong();
                        System.out.println("Кошо турган студенттин Id син жазыныз:  ");
                        Long id = scannerSan.nextLong();
                        System.out.println("Атыны жазыныз: ");
                        String name = scannerSoz.nextLine();
                        System.out.println("Фамилиясы :");
                        String surname = scannerSoz.nextLine();
                        System.out.println("Почтасын жазыныз: ");
                        String email = scannerSoz.nextLine();
                        System.out.println("Паролун жазыныз: ");
                        String password = scannerSoz.nextLine();
                        System.out.println("Жынысын жазыныз: ");
                        String gender = scannerSoz.nextLine();
                        studentServiceImpl.addNewStudentToGroup(groupId, id, name, surname, email, password, gender);

                        break;
                    } case 6:{
                        System.out.println("Алмаштыра турган студенттин id си: ");
                        String oldName=scannerSoz.nextLine();
                        System.out.println("Киргизе турган студентти id си : ");
                        Long id1=scannerSan.nextLong();
                        System.out.println("Аты: ");
                        String name=scannerSoz.nextLine();
                        System.out.println("Фамилиясы : ");
                        String surname=scannerSoz.nextLine();
                        System.out.println("Почтасы: ");
                        String email=scannerSoz.nextLine();
                        System.out.println("Паролун: ");
                        String password=scannerSoz.nextLine();
                        System.out.println("Жынысы: ");
                        String gender=scannerSoz.nextLine();
                        studentServiceImpl.updateStudent(new Student(id1,name,surname,email,password,gender));
                        break;
                    } case 7:{
                        System.out.println("Таба турган студенттин атын жазыныз: ");
                        String name=scannerSoz.nextLine();
                        studentServiceImpl.findStudentByFirstName(dataBase.getStudents(),name);
                        System.out.println(scannerSoz.nextLine());
                    }
                }
            }
        }
    }








  public static void zoneGetTime(){
        ZonedDateTime zonedDateTime=ZonedDateTime.now();
        if (zonedDateTime.getHour()>=6&&zonedDateTime.getHour()<=11){
            System.out.println("Кутман тан! Саат-> "+zonedDateTime.getHour()+":"+zonedDateTime.getMinute());
        } else if (zonedDateTime.getHour()>=12&&zonedDateTime.getHour()<=19) {
            System.out.println("Кутман кун! Саат-> "+zonedDateTime.getHour()+":"+zonedDateTime.getMinute());
        }else{
            System.out.println("Кутман тун! Саат-> "+zonedDateTime.getHour()+":"+zonedDateTime.getMinute());
        }
  }

}

