package za.ac.nwu.bonsai.businessobject;

public enum LeaveType {

	ANNUAL("Annual", 1),
	SICK("Sick", 2),
	FAMILY_RESPONSIBILITY("Family Responsibility", 3),
	STUDY("Study", 4);

	LeaveType(String name, int priority){
		this.name = name;
		this.priority = priority;
	}

	private String name;
	private final int priority;


}
