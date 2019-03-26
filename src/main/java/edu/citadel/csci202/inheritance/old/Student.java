package edu.citadel.csci202.inheritance.old;

public class Student extends Person {

    private String cAddr;
    private String email;

    Student(String fn, String ln, String pn, String ca, String em){
        super(fn, ln, pn);
        this.cAddr = ca;
        this.email = em;
    }


    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Student [cAddr=" + cAddr + ", email=" + email + ", getFname()=" + getFname() + ", getLname()="
                + getLname() + ", getPhNum()=" + getPhNum() + ", hashCode()=" + hashCode() + ", toString()="
                + super.toString() + ", getClass()=" + getClass() + "]";
    }



}