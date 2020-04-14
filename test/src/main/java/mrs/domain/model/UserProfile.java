package src.domain.model;

@Entity
@Data
@Table(name = "userprofile")
public class User{
	@OneToOne
	@JoinColumn
	@MapsId
	@Column(name = "user_id")
	private String user_id;
	@Column(name = "nickname")
	private String nickname;
}