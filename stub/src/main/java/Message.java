import javax.servlet.http.HttpServletResponse;
import java.util.Objects;
import javax.servlet.annotation.*;

public class Message {

    private String client;
    private int summ;

    public Message(String client, int summ) {
        this.client = client;
        this.summ = summ;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public int getSumm() {
        return summ;
    }

    public void setSumm(int summ) {
        this.summ = summ;
    }
    @Override
    public String toString() {
        return "\"client\":" + client + "\"summ\"" + summ;
    }

//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//        if (obj == null) {
//            return false;
//        }
//        if (getClass() != obj.getClass()) {
//            return false;
//        }
//        final Message other = (Message) obj;
//        if (this.summ != other.summ) {
//            return false;
//        }
//        if (!Objects.equals(this.client, other.client)) {
//            return false;
//        }
//    }
}


