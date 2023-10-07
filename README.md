# java_compiler for simple language. 
## sample
int main(){
    int a;
    a=1;
    int b;
    b=2;
    int c;
    c = a + b;
    return 0;
}

main:
	pushq 	%rbp
	movq  	%rsp, 	%rbp
	subq 	$24, 	%rsp

	movq 	$1, 	%r15
	movq 	$1, -8(%rbp)
	movq 	$2, 	%r14
	movq 	$2, -16(%rbp)
	movq 	-8(%rbp), 	%r13
	movq 	-16(%rbp), 	%r12
	addq 	%r13, 	%r12
	movq 	%r12, -24(%rbp)

	movq 	$0, 	%rax
	leave
	ret
