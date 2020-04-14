package src.domain.repository;

@Repository
public interface UserRepository extends JpaRepository<User,String>{
	public Optional<User> findById(String UserId);
}