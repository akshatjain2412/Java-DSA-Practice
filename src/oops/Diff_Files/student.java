package oops.Diff_Files;

  class  student { //we only make static clases which is inside a class or we can call as inner classes
      //we can't outer class make as static.
    int rollno;
    String name;
    int age;
    double percentage;

     student(int rollno,String name,int age,double percentage){
        this.age=age;
        this.name=name;
        this.percentage=percentage;
        this.rollno=rollno;

    }
   static void print(student i){
        System.out.println(i.rollno);
        System.out.println(i.name);
        System.out.println(i.age);
        System.out.println(i.percentage);
    }
}
