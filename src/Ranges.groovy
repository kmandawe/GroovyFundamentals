def numbers = 1..10
for (num in numbers) {
    println num
}

enum DAYS {
    SUN,
    MON,
    TUE,
    WED,
    THU,
    FRI,
    SAT
}

def range = 'a'..'g'

for(var in range) {
    println var
}

def weekdays = DAYS.MON..DAYS.FRI

for(day in weekdays) {
    println day
}

println "Extents: "
println weekdays.from
println weekdays.to
