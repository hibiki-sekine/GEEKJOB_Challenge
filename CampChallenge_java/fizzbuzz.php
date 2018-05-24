<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ナベアツ課題</title>
</head>
<body>
	<h1>ナベアツ課題</h1>
       <?php
        //　----------ここから下へソースコードを書く------------

        $i = 1;
        while($i<=40){
          echo $i;
          if(($i%3==0 || strpos($i,'3')!==false) && ($i%5==0)){
            echo "アホになる犬っぽくなる";
          }else if($i%3==0 || strpos($i,'3')!==false){
            echo "アホになる";
          }else if($i%5==0){
            echo "犬っぽくなる";
          }
          echo "<br>";
					$i++;
        }

       //　-------------------------ここまで------------------------------
        ?>
</body>
</html>
