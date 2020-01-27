<html>
    
    <head>
        <title>YOCOBoard</title>
        <meta charset="UTF-8">
        <meta name="description" content="YOCOBoard">
        <meta name="author" content="RubanS">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
         <link rel="stylesheet" href="/css/Home.css"/>
         
          <script src="/jsp/Add.js"></script>
           <script src="http://code.jquery.com/jquery-latest.min.js"></script>
      </head>
    <body>  
        <div class="Top clearfix" >
           <a href="https://full.io/" target="_blank" >
           
            <img class="img" src="/resource/full logo final2.png" height="45px" width="150px" ></a>
        
           <img style="float: right;"  src="/resource/userfinal.png"height="50px" width="50px" >
        
           <div class="center"><input type="checkbox" id="switch"  onclick="add()" /><label for="switch"></label></div>    
        </div>
        <center> <Input class="dropdown" type="date"name="DATE" value="2019-12-15"></Input><div id="clock">00:00:00</div></center>
       
        <hr>
        
        <center><b><font size="6px">Timeline</b></font></center>

        <hr>
        <div style="float: left;"><br><br><br><br><br><br><input class="button" type="button" name="left" value="&larr;"> </div>
        
        <div>
            <table id="tab" >
            
          
            
            </table>
            <button id="confrim"  >confrim</button>
        </div>
       
        <div style="float: right;"><br><br><br><br><br><br><input class="button" type="button" name="right" value="&rarr;"> </div>


        <div class="logout">
         <form action="/logout">
        
        
        <button >LOGOUT</button>
        
        </form>
        </div>
        
           
        
        
    </body>
</html>