package mrs.domain.model.dto;

@Data
public class UserRequest implements Serializable{
	@NotEmpty(message ="empty")
	@Size(max = 100,message = "100ˆÈ‰º")
	private String username;
	@Size(max = 255,message ="255ˆÈ‰º")
	private String nickname;
}