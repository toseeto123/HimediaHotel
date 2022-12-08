/**
 * 
 */
 
 function boardCheck(){
	if(document.frm.name.value.length==0){
		alert("작성자를 입력해 주세요");
		return false;
	}
	
	if(document.frm.pass.value.length==0){
		alert("비밀번호 입력해 주세요");
		return false;
	}
	
	if(document.frm.title.value.length==0){
		alert("제목 입력해 주세요");
		return false;
	}
	return true;
	
		
}

function open_win(url, name){
	window.open(url,name,"width:250, height:250");
	
}

function passCheck(){
	if(document.frm.pass.value.length==0){
		alert("비밀번호 입력하세요");
		return false;
	}
}










 