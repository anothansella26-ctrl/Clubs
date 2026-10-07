import java.util.ArrayList;
import java.util.Iterator;

// question 1
/**
 * Store details of club memberships.
 * 
 * @author (your name) 
 * @version 7.0
 */
public class Club
{
    private ArrayList<Membership> members;
    // question 1
    /**
     * Constructor for objects of class Club
     */
    public Club()
    {
        members = new ArrayList<Membership>();// Initialise any fields here ...
        // question1 
    }

    /**
     * Add a new member to the club's list of members.
     * @param member The member object to be added.
     */
    public void join(Membership member)
    {
        members.add(member);
        // question 3 
    }

    /**
     * @return The number of members (Membership objects) in
     *         the club.
     */
    public int numberOfMembers()
    {
        return members.size();
        // question2 
    }
    /**
    * Determine the number of members who joined in the
    * given month.
    * @param month The month we are interested in.
    */
        public int joinedInMonth(int month){
        if (month<=0 ||month>12){ 
            System.out.println("Invaild month:"+month);
            return 0;
        }else {
            int count = 0;
            for(Membership m :members){
                if (m.getMonth()==month){
                    count++;
                }
            }
            return count;
        }
    } 
    /**
    * Remove from the club's collection all members who
    * joined in the given month, and return them stored in a separate collection object.
    * @param month The month of the membership.
    * @param year The year of the membership.
    * @return The members who joined in the given month and year.
    */
        public ArrayList<Membership> purge(int month, int year){
        if (month<=0 ||month>12){
            System.out.println("ERROR");
            return null;
        }else if (year<=1900 || year>2026) {
            System.out.println("ERROR");
            return null;
        }else {
            ArrayList<Membership> removals = new ArrayList();
            Iterator<Membership> it =members.iterator();
            while (it.hasNext()){
                Membership m= it.next();
                if (m.getMonth()==month && m.getYear()==year){
                    System.out.println("Membership found in "+month + "/"+year);
                    removals.add(m);
                    it.remove();
                }
            }
            return removals;
        }
    }
}
