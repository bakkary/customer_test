import java.io.ObjectInputFilter;
import java.util.ArrayList;

public class Customer {


    private String name;
    private int ID = 0;
    private Status status;
    ArrayList <BankAcount> acounts = new ArrayList<>();

    public boolean addAcount(BankAcount acount){
            boolean create;
        if (acounts.contains(acount)){
            create = true;

        }else {

            create = false;
        }

        return create;
    }

    public boolean removeAcount(BankAcount acount){


        boolean check;


        if (acounts.contains(acount)){

        check = true;

        }else{
            check = false;
        }

        return check;
    }




    public String getName(){

        return name;
    }

    public int getID(){
        return ID;
    }

    public Status getStatus(){

        return status;
    }

    public void setStatus(Status status){

        this.status = status;
    }


    public void setName(String name) {
        this.name = name;
    }


}
