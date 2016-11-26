package bookmarks;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Created by desol on 2016/11/26.
 */
@Entity
public class Bookmark {
    @JsonIgnore
    @ManyToOne
    private Account account;

    @Id
    @GeneratedValue
    private Long id;

    Bookmark(){} //JPA

    public Bookmark(Account account, String uri, String description){
        this.account = account;
        this.description = description;
        this.uri = uri;
    }

    public String description;
    public String uri;

    public Account getAccount() {
        return account;
    }

    public Long getId(){
        return id;
    }

    public String getDescription(){
        return description;
    }

    public String getUri(){
        return uri;
    }
}
