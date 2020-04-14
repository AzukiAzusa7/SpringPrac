package mrs.domain.model.dto;

@Data
public class UserRequest implements Serializable{
	@NotEmpty(message ="empty")
	@Size(max = 100,message = "100�ȉ�")
	private String username;
	@Size(max = 255,message ="255�ȉ�")
	private String nickname;
}