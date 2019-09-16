class FinalGradeCalc constructor (grade : Double , weight : Double , exp : Double)
{
    var myGrade = grade
    var myWeight = weight
    var myExp = exp

    fun finalExamGrade() : Double
    {
        var temp = (myGrade) * ((100-myWeight)/100)
        var temp1 = myExp - temp
        var temp2 = temp1/myWeight
         return temp2 * 100
    }

    fun currentGrade() : Double{
        return myGrade
    }
}