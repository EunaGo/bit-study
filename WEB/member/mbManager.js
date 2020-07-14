// 회원 정보를 저장시킬 배열생성
var members=[];

// 회원 데이터를 객체화 시킬 생성자 함수
function Member(mid, mname, mpw) {
    this.id = mid;
    this.name = mname;
    this.pw = mpw;
}

// 공통 함수: 메서드 정의
Member.prototype.toString=function(){
    var makeHtml='';
    
    makeHtml+='<td>';
    makeHtml+=this.id;
    makeHtml+='</td>';
    makeHtml+='<td>';
    makeHtml+=this.pw;
    makeHtml+='</td>';
    makeHtml+='<td>';
    makeHtml+=this.name;
    makeHtml+='</td>';
    }
    
    // 데이터 저장함수
    function addMember(member) {
    members.push(member);
    
    console.log(members);
    displayTable();
    }
    
    // 회원 데이터 저장
    function createMember() {
    var id = document.getElementById('uid').value;
    var pw = document.getElementById('pw').value;
    var name = document.getElementById('uname').value;
    
    addMember(new Member(id, name, pw));
    
    return false;
    }
    
    function displayTable() {
    var listHtml='';
    
    listHtml+='<table class="listtable">';
    listHtml += '   <tr>';
    listHtml += '       <th>index</th>';
    listHtml += '       <th>ID(이메일)</th>';
    listHtml += '       <th>비밀번호</th>';
    listHtml += '       <th>이름</th>';
    listHtml += '       <th>관리</th>';
    listHtml += '   </tr>';
    
    for(let i = 0; i <members.length; i++) {
        
        listHtml+='     <tr>';
        listHtml+='         <td>'+i+'</td>';
        listHtml+='         <td>'+members[i].id+'</td>';
        listHtml+='         <td>'+members[i].pw+'</td>';
        listHtml+='         <td>'+members[i].name+'</td>';
        listHtml += '       <td> <a href="javascript:editSet('+i+')">수정</a> | <a href="javascript:deleteMember('+i+')">삭제</a> </td>';
        listHtml += '   </tr>';
    }

    listHtml+='</table>';

    var listTable = document.getElementById('list');
    listTable.innerHTML = listHtml;
    
    
}


function editSet(idx) {
    document.getElementById('edit').style.display='block';

    document.getElementById('eid').value=members[idx].id;
    document.getElementById('ename').value=members[idx].name;    
    document.getElementById('epw').value=members[idx].pw;
    DocumentFragment.getElementById('idx').value=idx;
}


function editMember() {
    var id = document.getElementById('eid').value;
    var pw = document.getElementById('epw').value;
    var name = document.getElementById('ename').value;
    var idx = document.getElementById('idx').value;

    members[parseInt(idx)].id=id;
    members[parseInt(idx)].pw=pw;
    members[parseInt(idx)].name=name;



    displayTable();

    return false;
}

function deleteMember(idx){

    if(confirm('삭제하시겠습니까?')){
        members.splice(idx,1);

        displayTable();

    }
}


window.onload=function() {
    displayTable();

    document.getElementById('regForm').onsubmit=createMember;
    document.getElementById('editForm').onsubmit=editMember;
}