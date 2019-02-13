var Employee=[
	{ name: "yukti", age: 20, salary: 1200000, DOB: "03-aug-1998"},
	{ name: "raman", age: 25, salary: 21000, DOB: "03-dec-1995"},
	{ name: "sita", age: 25, salary: 42300, DOB: "29-july-1993"},
	{ name: "priya", age: 20, salary: 4340, DOB: "09-may-1994"},
	{ name: "dolly", age: 25, salary: 3000, DOB: "03-aug-1999"},
	{ name: "rohit", age: 18, salary: 35000, DOB: "23-dec-2000"},
	{ name: "virat", age: 38, salary: 958400, DOB: "07-sept-1980"},
	{ name: "mohit", age: 38, salary: 300, DOB: "23-dec-1996"},
	{ name: "sairat", age: 28, salary: 900, DOB: "07-sept-1989"}
	];

	var n=document.getElementById("para");
         var i;
	Employee.forEach(function looping(i)
		{
		    n.innerHTML= n.innerHTML+"{ name: "+i.name+" , ";
			n.innerHTML= n.innerHTML+(" age: "+i.age+" , ");
			n.innerHTML= n.innerHTML+(" salary: "+i.salary+" , ");
			n.innerHTML= n.innerHTML+(" DOB: "+i.DOB+" }<br>");
		});

	console.log(Employee);
    



	function isGreater(Employee){
	  if(Employee.salary>5000) return true;}
		
	var salaryhigh=Employee.filter(isGreater);
	console.log("employees with salary greater than 5000");
	console.log(salaryhigh);




	function isPromoted(Employee){
	  if(Employee.salary<1000 && Employee.age>20) return true;}
		
	var promotion=Employee.filter(isPromoted);
	var i;
	promotion.forEach(function(i)
	{
		i.salary=i.salary+(5*i.salary);
	});
	console.log("employees with salary five times increased are-");
	console.log(promotion);




	console.log("grouped by age-");

	Array.prototype.groupBy = function(prop) {
  return this.reduce(function(groups, item) {
    var val = item[prop]
    groups[val] = groups[val] || []
    groups[val].push(item)
    return groups
  }, {})
}

var grouped=Employee.groupBy('age');
console.log(grouped);

