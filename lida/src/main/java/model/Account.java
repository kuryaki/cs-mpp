package model;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.*;

@Entity("accounts")
@Indexes(
    @Index(fields = @Field("name"))
)
public class Account {
	
	@Id
	private ObjectId id;
	private String name;
	
	public Account() {
	}
    
	public Account(String name) {
		this.setName(name);
	}

    public ObjectId getSomeId() { 
        return id; 
    } 
    
    public void setSomeId(ObjectId someId) { 
        this.id = someId; 
    } 


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
