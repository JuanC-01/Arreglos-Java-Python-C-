lista=[]
ac=0
A = [[[1,2.8,3.5],[2,2.8,4.3],[3,4.8,3.6]]];
for i in range(0,1):
    smanotas=0;
    for j in range(0,3):
        ac=ac+1;
        for k in range (0,3):
            
            ac=ac + A[i][j][k];
        smanotas= smanotas+(ac/3);

        print("promedio de notas curso",j,": "+str(j+1) +">"+ str(ac/3));
print (A)          
print("\npromedio de notas por crso"+ str(smanotas/3));