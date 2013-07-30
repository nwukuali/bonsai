package za.ac.nwu.bonsai.kew.role;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.kuali.rice.kim.api.KimConstants;
import org.kuali.rice.kim.api.role.RoleMembership;
import org.kuali.rice.kim.framework.role.RoleTypeService;
import org.kuali.rice.kns.kim.role.DerivedRoleTypeServiceBase;

public class LeaveNotificationDerivedRoleServiceImpl extends
		DerivedRoleTypeServiceBase {

	RoleTypeService parentGroupDerivedRoleService;

	@Override
	public List<RoleMembership> getRoleMembersFromDerivedRole(
			String namespaceCode, String roleName,
			Map<String, String> qualification) {

		List<RoleMembership> members = new ArrayList<RoleMembership>();

		String principleIds = qualification.get("principleIds");
		String lastApprover = "";
		RoleMembership applicantMbership = null;

		for (String principleId : principleIds.split(";")) {
			Map<String, String> attributes = new HashMap<String, String>();
			applicantMbership = RoleMembership.Builder.create(null, null,
					principleId,
					KimConstants.KimGroupMemberTypes.PRINCIPAL_MEMBER_TYPE,
					attributes).build();
			members.add(applicantMbership);
			lastApprover = principleId;
		}
		members.remove(applicantMbership);

		qualification.put("principleId", lastApprover);

		members.addAll(parentGroupDerivedRoleService
				.getRoleMembersFromDerivedRole(namespaceCode, roleName,
						qualification));

		return members;
	}

	public void setParentGroupDerivedRoleService(
			RoleTypeService parentGroupDerivedRoleService) {
		this.parentGroupDerivedRoleService = parentGroupDerivedRoleService;
	}

}
