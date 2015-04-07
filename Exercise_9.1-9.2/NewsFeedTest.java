

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class NewsFeedTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class NewsFeedTest
{
    private MessagePost messageP1;
    private PhotoPost photoPos1;
    private NewsFeed newsFeed1;
    private EventPost eventPos1;

    
    
    

    /**
     * Default constructor for test class NewsFeedTest
     */
    public NewsFeedTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        messageP1 = new MessagePost("Rick", "Test message post");
        photoPos1 = new PhotoPost("James", "C:/user/pics/pic.jpg", "Test pic.jpg");
        newsFeed1 = new NewsFeed();
        newsFeed1.addPost(messageP1);
        newsFeed1.addPost(photoPos1);
        newsFeed1.show();
        eventPos1 = new EventPost("Rick", "doesn't like bluej");
        newsFeed1.addPost(eventPos1);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
}
