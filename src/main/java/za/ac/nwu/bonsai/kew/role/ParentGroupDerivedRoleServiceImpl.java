package za.ac.nwu.bonsai.kew.role;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.kuali.rice.core.api.membership.MemberType;
import org.kuali.rice.kim.api.KimConstants;
import org.kuali.rice.kim.api.group.GroupMember;
import org.kuali.rice.kim.api.group.GroupService;
import org.kuali.rice.kim.api.role.RoleMembership;
import org.kuali.rice.kim.api.services.KimApiServiceLocator;
import org.kuali.rice.kns.kim.role.DerivedRoleTypeServiceBase;

public class ParentGroupDerivedRoleServiceImpl extends
		DerivedRoleTypeServiceBase {

	private GroupService groupService;

	@Override
	public List<RoleMembership> getRoleMembersFromDerivedRole(
			String namespaceCode, String roleName,
			Map<String, String> qualification) {

		List<RoleMembership> members = new ArrayList<RoleMembership>();

		String principleId = qualification.get("principleId");

		List<String> principleGroupIds = getGroupService()
				.getDirectGroupIdsByPrincipalId(principleId);

		// Direct parent groups
		List<String> parentGroupIds = new ArrayList<String>();

		for (String groupId : principleGroupIds) {
			parentGroupIds.addAll(getGroupService().getDirectParentGroupIds(
					groupId));
		}

		for (String groupId : parentGroupIds) {
			List<GroupMember> groupMembers = getGroupService()
					.getMembersOfGroup(groupId);

			for (GroupMember groupMember : groupMembers) {

				if (groupMember.getType().equals(MemberType.PRINCIPAL)) {
					Map<String, String> attributes = new HashMap<String, String>();
					
						RoleMembership membership = RoleMembership.Builder
								.create(null,
										null,
										groupMember.getMemberId(),
										KimConstants.KimGroupMemberTypes.PRINCIPAL_MEMBER_TYPE,
										attributes).build();
						members.add(membership);
					
				}
			}
		}

		return members;
	}

	public void setGroupService(GroupService groupService) {
		this.groupService = groupService;
	}

	public GroupService getGroupService() {
		if (groupService == null) {
			groupService = KimApiServiceLocator.getGroupService();
		}
		return groupService;
	}

}
