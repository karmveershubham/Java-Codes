//Democonstructor for java
class CTest1{
    CTest1(){
        System.out.println("Constructor Ctest1()");
    }

    CTest1(int a){              //Constructor  can be created multiple time based on different parameters
        System.out.println("Constructor Ctest1()"+a);
    }

    void dis(){
        System.out.println("Display method from subclass");
    }
}

class DemoCon1{
    public static void main( String arg[]){
        DemoCon1 obj1 = new DemoCon1();
        CTest1 obj2= new CTest1();
        CTest1 obj3= new CTest1(5);
        obj2.dis();


    }
    DemoCon1(){
        System.out.println("Constructor Democon1()");
    }

    
}