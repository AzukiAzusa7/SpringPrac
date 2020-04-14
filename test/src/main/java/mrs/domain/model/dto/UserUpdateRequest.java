package mrs.domain.model.dto;

@Data
@EqualsAndHashCode(callSuper = false)
public class UserUpdateRequest extends UserRequest implements Seriablizable{
	@NotNull
	priavte String userId;
}