package edu.citadel.csci202.inheritance.old;

public class Person {

    private String fname;
    private String lname;
    private String phNum;

    Person(String fn, String ln, String pn){
        this.fname = fn;
        this.lname = ln;
        this.phNum = pn;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }


    public String getPhNum() {
        return phNum;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((fname == null) ? 0 : fname.hashCode());
        result = prime * result + ((lname == null) ? 0 : lname.hashCode());
        result = prime * result + ((phNum == null) ? 0 : phNum.hashCode());
        return result;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Person)) {
            return false;
        }
        Person other = (Person) obj;
        if (fname == null) {
            if (other.fname != null) {
                return false;
            }
        } else if (!fname.equals(other.fname)) {
            return false;
        }
        if (lname == null) {
            if (other.lname != null) {
                return false;
            }
        } else if (!lname.equals(other.lname)) {
            return false;
        }
        if (phNum == null) {
            if (other.phNum != null) {
                return false;
            }
        } else if (!phNum.equals(other.phNum)) {
            return false;
        }
        return true;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Person [fname=" + fname + ", lname=" + lname + ", phNum=" + phNum + "]";
    }

}