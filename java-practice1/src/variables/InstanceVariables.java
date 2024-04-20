package variables;

public class InstanceVariables {
    /**
     *  Instance is related to object so we need to creat object to call instance variable
     *  Scope is within the class
     *  Memory allocation when object is created
     *  Memory - heap
     */
    int a = 10;// a is a instance variable or global variable
    String name = "Prime Testing ";


    public static void main(String[] args) {

        InstanceVariables obj = new InstanceVariables();
        System.out.println(obj.a);
        System.out.println(obj.name);


    }

    public void myMethod(){
        System.out.println(a);
        InstanceVariables instanceVariables = new InstanceVariables();
        System.out.println(instanceVariables.name);


    }

    }


