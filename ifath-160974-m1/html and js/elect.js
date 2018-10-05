function validate()
{

	var conno=document.getElementById('cno').value;			//in order to store consumer no
	var cname=document.getElementById('cname').value;		//in order to store consumer name
	var emailid=document.getElementById('ena').value;		//in order to store email id
	var nounits=document.getElementById('unit').value;		// in order to store no of units used by user
	var ebill;
		if(conno.length==8)		//to check that the concumer number should be excatly 8 digits
		{
				if(cname.length>=3)
					{
						if(emailid!="")
						{
							if(nounits>0)  		// to check whether a valid no of units is given as output
								{
										if(nounits<=100)
											{
												
												ebill = nounits * 2.96;
											}
											else{
											
												ebill = nounits * 5.56;
											
											}
											
											alert("consumer number is:"+conno+"\n"+"cosumer name is:"+cname+"\n"+"consume id is:"+emailid+"\n"+"no of units is:"+nounits+"\n"+"electricity charge is:"+ebill);
											
											return true;
								}
								else {
								
									alert('enter  valid number of units');
								}
						}
						else{
						alert("mail id cant be empty");
						}
					} 
			else {
					alert("name should have min 3 char");
            }
        } 
		else {
            alert('consumer number should be 8digits');
        }
 
    return false;
}