import java.util.Date;

public class Message {
    public final byte[] data;
    public final String asText;
    public final double asDouble;
    public final Date date;
    /*
    public Message(byte[] data,String asText, double asDouble, Date date) {
        this.data = data;
        this.asText = asText;
        this.asDouble = asDouble;
        this.date = date;
        //\this.data=new Date(data,getTime());
    }
*/
    public Message(String args) {
        this.Message(args.getBytes(),Double.Nah,new Date());
    }
    public Message(double date)
    {
        this.Message("", date, new Date());
        {
        }
    }
    }

}
