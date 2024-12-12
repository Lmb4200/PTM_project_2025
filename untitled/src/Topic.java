import java.util.ArrayList;
import java.util.List;

public class Topic {
    public  final String name;
    List<Agent> subs= new ArrayList<>();
    // A list of agents who have registered to listen to this topic.
    List<Agent> pubs= new ArrayList<>();
    // A list of agents who are scheduled to publish.

    Topic(String name)
    {
        this.name=name;
    }

    public void subscribe(Agent a){
        this.subs.add(a);
    }
    public void unsubscribe(Agent a){
        this.subs.remove(a);
    }

    public void publish(Message m){
        //as getting a message its will publish it to all agent
        // its will do callback
    }

    public void addPublisher(Agent a){
        this.pubs.add(a);
    }

    public void removePublisher(Agent a){
        this.pubs.remove(a);
    }


}
