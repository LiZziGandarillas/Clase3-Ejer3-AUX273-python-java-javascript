n=int(input())
cont=0
t=1
for i in range(n):
	if cont>=t:
		t=t+2
		cont=0
	print(t)
	cont=cont+1
