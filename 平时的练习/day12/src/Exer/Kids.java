package Exer;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class Kids extends ManKind {

    private int yearsOld;

    public Kids(){

    }

    public int getYearsOld() {
        return yearsOld;
    }

    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    public void printAge(int age){
        yearsOld = age;
        System.out.println(yearsOld);
    }

    @Override
    public void employee(){
        System.out.println(" Kids should study and no job");
    }



}
