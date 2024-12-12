public class TopicManagerSingleton
{
public static TopicManager get()
{
    return TopicManager.instance;
}

    public static class TopicManager
    {
        private static final TopicManager instance=new TopicManager();
    }


}
public class Map{
     final Map<String,String> map = new HashMap<>();
    ;

}