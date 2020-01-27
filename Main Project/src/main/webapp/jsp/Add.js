


var i=0;
var c=0;


function startTime()
{
    var today=new Date();
var h=today.getHours();
var m=today.getMinutes();
var s=today.getSeconds();
var clock= document.getElementById('clock');
m=checkTime(m);
s=checkTime(s);

    clock.innerHTML=h+":"+m+":"+s;

    t=setTimeout('startTime()',500);

}

function checkTime(i)
{
if (i<10)
{
i="0" + i;
}
return i;
}
function add(){
    
    var check=document.getElementById("switch");
    
    
    if(check.checked == true)
    {
       
        var today=new Date();
        var hours=today.getHours();
        var minutes=today.getMinutes();
        var seconds=today.getSeconds();
        var b=today.getTime();
        c=b;
        
        minutes=checkTime(minutes);
        seconds=checkTime(seconds);
        
        
        
        startTime();
        
        var table=document.getElementById("tab"),
        newRow = table.insertRow(table.length),
        cell1=newRow.insertCell(0),
        cell2=newRow.insertCell(1),
        cell3= newRow.insertCell(2),
        cell4= newRow.insertCell(3);
        cell5=newRow.insertCell(4);
        cell1.innerHTML="<input type='text' name='userid'placeholder='Add a description'>";
        cell2.innerHTML="<select><option>Project</option> </select>";
        cell3.innerHTML=hours+ ":"+minutes+ ":"+seconds;
        cell4.innerHTML="Ongoing";
        cell5.innerHTML="Ongoing";
    }
    else
    {
        var today=new Date();
        var hours=today.getHours();
        var minutes=today.getMinutes();
        var seconds=today.getSeconds();
        var b1=today.getTime();
       
        
        minutes=checkTime(minutes);
        seconds=checkTime(seconds);
        document.getElementById("tab").childNodes[1].childNodes[i].childNodes[3].childNodes[0].nodeValue=hours+ ":"+minutes+ ":"+seconds;
        // start= document.getElementById("tab").childNodes[3].childNodes[i].childNodes[2].childNodes[0].nodeValue="fg,";
         var total=b1-c;
        
        var seconds = Math.floor((total/ 1000) % 60),
        minutes = Math.floor((total/ (1000 * 60)) % 60),
        hours = Math.floor((total / (1000 * 60 * 60)) % 24);
        if (hours   < 10) {hours   = "0"+hours;}
        if (minutes < 10) {minutes = "0"+minutes;}
        if (seconds < 10) {seconds = "0"+seconds;}
        document.getElementById("tab").childNodes[1].childNodes[i].childNodes[4].childNodes[0].nodeValue=hours+ ":"+minutes+ ":"+seconds;
        
        
        var description =     document.getElementById("tab").childNodes[1].childNodes[i].childNodes[0].childNodes[0].value;
        var project=    document.getElementById("tab").childNodes[1].childNodes[i].childNodes[1].childNodes[0].value;
        //c=start milliseconds
        //b1=end milli seconds
        //total= total milliseconds spent
        i++;
        var check=document.getElementById("confrim");
        check.style.display="none";

       
        var a = {des: description, pro: project, start:c,end:b1,tot:total};
            $.ajax({
                type: "POST",
                url: "/store", 
                contentType: "application/json; charset=utf-8",
                data: a,
                dataType: "json",
                success: function (result) {
                    alert('Success');
                                        
                },
    
                error: function (result) {
                    alert('error');
                }
            });
       
    }

    
    
}
