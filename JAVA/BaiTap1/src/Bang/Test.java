package Bang;

public class Test {
	public static void main(String[] args) {
		Department dep1 = new Department(1l, "Sale");
		Department dep2 = new Department(2l, "Kỹ thuât");
		Department dep3 = new Department(3l, "Tổ chức");

		Position pos1 = new Position(1l, PositionName.Dev);
		Position pos2 = new Position(2l, PositionName.Test);
		Position pos3 = new Position(3l, PositionName.Scrum_Master);
		Position pos4 = new Position(4l, PositionName.PM);

		Account acc1 = new Account(1l, "Hoan", null, null, dep3, pos4, null);
		Account acc2 = new Account(2l, "Nguyen", null, null, dep1, pos2, null);
		Account acc3 = new Account(3l, "Thao", null, null, dep1, pos3, null);

		Account[] arryAccounts = { acc1, acc2, acc3 };

		for (Account account : arryAccounts) {
			System.out.println("ID: " + account.id + "  Tên: " + account.name + "  Phòng ban: " + account.departmentID.name
					+ "   Vị trí: " + account.positionID.name);

		}

	}
}
