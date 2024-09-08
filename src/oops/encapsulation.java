package oops;

public class encapsulation {
    static class employee{
        private int emp_id;//all variable must be private in order to achieve encapsulation
        private int emp_no;
        public void setEmp_id(int emp_id){ //setter getter must be public
            this.emp_id=emp_id;
        }
        public void setEmp_no(int emp_no){
            this.emp_no=emp_no;
        }
        public void both(int emp_id,int emp_no){
            this.emp_no=emp_no;
            this.emp_id=emp_id;
        }
        int getEmp_id(){
            return this.emp_id;
        }
        int getEmp_no(){
            return this.emp_no;
        }
        int result(){
            return emp_id+emp_no;
        }
    }

    public static void main(String[] args) {
        encapsulation.employee e=new encapsulation.employee();
        e.setEmp_id(192);
        e.setEmp_no(932);
        System.out.println(e.getEmp_id());
        System.out.println(e.getEmp_no());

        e.both(2,21);
        System.out.println(e.getEmp_id());
        System.out.println(e.getEmp_no());
        System.out.println(e.result());
    }
}
