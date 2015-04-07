
/**
 * Write a description of class EventPost here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EventPost extends Post
{
    private String event;

    public EventPost(String author, String event) {
        super(author);
        this.event = event;
    }

    public String getEvent() {
        return this.event;
    }

    public void display()
    {
        System.out.println(getUserName() + ":");
        System.out.println(event);
        System.out.println(timeStamp());
    }
   
}
