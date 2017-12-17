import java.util.ArrayList;
import java.util.List;

public class OnsiteStore extends Store {

	private List<Branch> branches = new ArrayList<Branch>();

	public OnsiteStore() {
	}

	public void addBranch(Branch branch) {
		branches.add(branch);
	}

	public List<Branch> getBranches() {
		return branches;
	}

}