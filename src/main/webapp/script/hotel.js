/**
 * 
 */

function hotelCheck() {
	if (document.frm.id.value.length == 0) {
		alert("아이디를 입력해 주세요");
		return false;
	}

	if (document.frm.pass.value.length == 0) {
		alert("비밀번호를 입력해 주세요");
		return false;
	}
	return true;


}

function registerCheck() {
	if (document.frm.name.value.length == 0) {
		alert("이름을 입력해 주세요");
		return false;
	}
	if (document.frm.id.value.length == 0) {
		alert("아이디를 입력해 주세요");
		return false;
	}

	if (document.frm.pass.value.length == 0) {
		alert("비밀번호를 입력해 주세요");
		return false;
	}
	var p1=document.getElementById("pass").value;
	var p2=document.getElementById("pass_check").value;
	
	if(p1.length < 6 || p1.length > 16){
		alert("암호는 6글자 이상, 16글자 미만으로 입력해주세요.");
		document.frm.pass.focus();
		return false;
	}
	if(p1!=p2){
		alert("비밀번호가 같지 않습니다.");
		return false;
	}else {
		alert("회원가입에 성공하였습니다.")
	}
	if (document.frm.repass.value.length == 0) {
		alert("비밀번호확인을 입력해 주세요");
		return false;
	}
	if (document.frm.email.value.length == 0) {
		alert("이메일을 입력해 주세요");
		return false;
	}
	
	return true;


}

function idCheck() {

	if (document.frm.id.value.length < 1) {
		alert("이름을 입력해 주세요.")
		document.frm.id.focus();
		return;
	}
	 var url="HotelServlet?command=hotel_id_check_form&id=" + document.frm.id.value;
	 window.open(url,"_black_1","toolbar=no,menubar=no,scrollbars=yes,width=450,height=200");
	
	if (document.frm.email.value.length < 1) {
		alert("이메일을 입력해 주세요")
		document.frm.email.focus();
		return;
	}
	frm.method="post";
	frm.action="hotel/findIdResult.jsp";
	frm.submit();
}	
function idok(){
		//opener는 회원가입창이 부모
	opener.frm.id.value=document.frm.id.value;
	opener.frm.reid.value=document.frm.id.value;
	self.close();
}

function passCheck() {
	if (frm1.id.value.length < 1) {
		alert("아이디를 입력해 주세요.")
		return false;
	}

	if (frm1.name.value.length < 1) {
		alert("이름을 입력해 주세요.")
		return false;
	}
	if (frm1.email.value.length < 1) {
		alert("이메일을 입력해 주세요")

		return false;
	}
	return true;
}





