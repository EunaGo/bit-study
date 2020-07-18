package member.model;

import java.util.List;

public class MemberListView {

	// ��ü �Խù��� ����
	private int memberTotalCount;
	// ���� ������ ��ȣ
	private int currentPageNumber;
	// �޽��� ����Ʈ
	private List<Member> memberList;
	// ��ü �������� ����
	private int pageTotalCount;
	// ������ �� ǥ�� �Խù��� ����
	private int memberCountPerpage;
	// �Խù��� ���� ��
	private int startRow;


		public MemberListView(int memberTotalCount, 
				int currentPageNumber, 
				List<Member> memberList, 
				int pageTotalCount,
				int memberCountPerpage, 
				int startRow) {
			
			this.memberTotalCount = memberTotalCount;
			this.currentPageNumber = currentPageNumber;
			this.memberList = memberList;
			this.pageTotalCount = pageTotalCount;
			this.memberCountPerpage = memberCountPerpage;
			this.startRow = startRow;
			
			calTotalPageCount();
		}


		
		private void calTotalPageCount() {
			
			if(memberTotalCount == 0) {
				pageTotalCount=0;
			} else {
				pageTotalCount = memberTotalCount/memberCountPerpage;
				if(memberTotalCount%memberCountPerpage>0) {
					pageTotalCount++;
				}
			}
			
		}

	public int getMemberTotalCount() {
		return memberTotalCount;
	}

	public void setMemberTotalCount(int memberTotalCount) {
		this.memberTotalCount = memberTotalCount;
	}

	public int getCurrentPageNumber() {
		return currentPageNumber;
	}

	public void setCurrentPageNumber(int currentPageNumber) {
		this.currentPageNumber = currentPageNumber;
	}

	public List<Member> getMemberList() {
		return memberList;
	}

	public void setMessageList(List<Member> messageList) {
		this.memberList = messageList;
	}

	public int getPageTotalCount() {
		return pageTotalCount;
	}

	public void setPageTotalCount(int pageTotalCount) {
		this.pageTotalCount = pageTotalCount;
	}

	public int getMemberCountPerpage() {
		return memberCountPerpage;
	}

	public void setMemberCountPerpage(int memberCountPerpage) {
		this.memberCountPerpage = memberCountPerpage;
	}

	public int getStartRow() {
		return startRow;
	}

	public void setStartRow(int startRow) {
		this.startRow = startRow;
	}



	@Override
	public String toString() {
		return "MemberListView [memberTotalCount=" + memberTotalCount + ", currentPageNumber=" + currentPageNumber
				+ ", messageList=" + memberList + ", pageTotalCount=" + pageTotalCount + ", memberCountPerpage="
				+ memberCountPerpage + ", startRow=" + startRow + ", endRow=" + "]";
	}
	public boolean isEmpty() {
		return memberTotalCount==0;
	}

}
