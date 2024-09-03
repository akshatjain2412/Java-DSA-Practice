package oops.Inheritance;

//we can't inherit from static class to nonstatic or vice versa
//
class inheritance{  //a single class
     static class animal {//this is the parent class
        final int ani=323;  //this is the static data member
        void display() {
            System.out.println(23);
        }
    }
     static class dog extends animal{
        int dog=22;//this is the data member of the dog class
        @Override
        void display() {  //this is inherited class
            System.out.println(ani+1);
            System.out.println(ani);
            super.display();
        }
    }
    void callDog(){   //this method use here so we can simply call nonstatic class
        dog g = new dog(); //our main method is static so we can use this method to call the class
        g.display();
    }
    public static void main(String[] args) {
            class goat extends dog {             //we can't extend nonstatic class in static class
                @Override             //we can't make method inside a method we can use lambda for that functionality
                void display() {
                    System.out.println(ani); //inherit the data member of parent class animal
                    System.out.println(dog); //inherit the data member of parent class dog
                    super.display();
                }
            }

        goat g=new goat(); //inner class for main
        g.display();
        inheritance s=new inheritance(); //outer class for main
        s.callDog();
    }
    }

    //Note-if we declare static in ani who is data member of animal class then data it change with whenever we change it
////if we declare are nonstatic then its we always change  as same again and again
//if we use final the value of ani can never be cange

