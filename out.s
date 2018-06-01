z/***************************************************************
* Construccion de compiladores
* Jonnathan Juarez, carne 15377
****************************************************************/
/*--------------------------------INICIO------------------------------*/
.text
.align 2
.global main
.type main,%function

main:
	stmfd sp!, {lr}	label_metodo1:label_metodo2:goto label_false_0label_true_0label_false_0while true goto label_while_true0goto label_while_false_0label_while_true_0label_while_false_0/* salida correcta */
fin:
	mov r0, #0
	mov r3, #0
	ldmfd sp!, {lr}	/* R13 = SP */
	bx lr
/*---------------------------Memoria---------------------------------*/
.data
.align 2
	formatoCaracter:
		.asciz"%c"
	formatoDecimal:
		.asciz"%d
"
	msj_ingreso: 
		.asciz "Ingrese un valor:\n"
	msj_resultado: 
		.asciz "El resultado es:\n"


