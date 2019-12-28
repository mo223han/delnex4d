function check()
{
	var pw = document.getElementById('pw').value;
	var cpw = document.getElementById('cpw').value;
	console.log(pw);

	if(pw!=cpw){
		alert('password did not match');
		return false;
	}
}