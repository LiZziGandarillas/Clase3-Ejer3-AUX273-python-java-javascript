process.stdin.on('data',function(data){
	var n=parseInt(data.toString());
	var cont=0, t=1;
	for(var i=0; i<n; i++)
	{
		if(cont>=t)
		{
			t=t+2;
			cont=0;
		}
		console.log(t);
		cont=cont+1;
	}
	process.exit();
});
