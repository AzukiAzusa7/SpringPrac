package src.domain.model;

@Entity
@Data
@Table(name = "user")
public class User{
	@OneToOne(mappedBy="user",cascade = CascadeType.ALL)
	@ToString.Exclude
	private UserProfile userProfile
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "userid")
	private String userid;
	@Column(name = "password")
	private String password;
	@Enumerated(EnumType.STRING)
	@Column(name = "role")
	private RoleName;
}