package com.example.fitnessapp.models

import com.example.fitnessapp.R

object WorkoutData {
    val allWorkouts = listOf(
        Workout("Mostek brzuszny", "1. Połóż się na brzuchu z całkowicie wyprostowanymi nogami i przedramionami na macie.\n" +
                "2. Zaangażuj tułów i unieś biodra.\n" +
                "3. Zatrzymaj się na 2 sekundy, a następnie wróć do pozycji wyjściowej.\n" +
                "4. Powtarzaj, aż zestaw będzie kompletny.",
            "Mostek brzuszny celuje w rdzeń i jest doskonałym ćwiczeniem wzmacniającym plecy, mięśnie brzucha, mięśnie skośne i mięśnie dna miednicy. To ćwiczenie pomaga zmniejszyć ryzyko nietrzymania moczu, poprawia zdrowie seksualne oraz zwiększa siłę i stabilność rdzenia.",
            Difficulty.BEGINNER, R.drawable.abdominal_bridge_beginner),
        Workout("Naprzemienny Superman", "1. Połóż się twarzą w dół na macie z całkowicie wyprostowanymi rękami i nogami.\n" +
                "2. Podnieś jedno ramię i przeciwną nogę z podłogi, wyginając plecy.\n" +
                "3. Przytrzymaj, licząc do 2, wróć do pozycji wyjściowej i powtórz z przeciwną ręką i nogą.\n" +
                "4. Naprzemiennie, aż zestaw będzie kompletny.",
            "Dodanie naprzemiennego supermana do rutynowego treningu pomaga wzmocnić dolną część pleców, poprawia postawę i stabilność oraz rozciąga górną część ciała. Aby mieć mocny rdzeń, ważne jest, aby pracować nie tylko z mięśniami brzucha i mięśniami skośnymi, ale także z środkową i dolną częścią pleców.",
            Difficulty.BEGINNER, R.drawable.alternating_superman_beginner),
        Workout("Rozciąganie pleców", "1. Zacznij na czworakach, umieszczając dłonie bezpośrednio pod ramionami, a kolana pod biodrami.\n" +
                "2. Opuść głowę i wciągnij mięśnie brzucha, zaokrąglając plecy i szyję.\n" +
                "3. Przytrzymaj przez 10 sekund.\n" +
                "4. Podnieś głowę i zegnij plecy w kierunku podłogi.\n" +
                "5. Przytrzymaj przez kolejne 10 sekund i powtórz.",
            "Rozciąganie kota i krowy to pozycja jogi, która jest regularnie włączana do rutynowych procedur uwalniających stres. Ta pozycja masuje i stymuluje narządy jamy brzusznej, tworzy równowagę emocjonalną, wzmacnia kręgosłup i koryguje postawę. Rozciąganie kota i krowy pomaga również wzmocnić mięśnie tułowia i może pomóc złagodzić ból i urazy dolnej części pleców oraz zapobiegać im.",
            Difficulty.BEGINNER, R.drawable.back_stretch_beginner),
        Workout("Wykrok w bok ze skrzyżowanymi ramionami", "1. Stań prosto ze stopami rozstawionymi na szerokość barków i ramionami wyciągniętymi poziomo na boki.\n" +
                "2. Wysuń prawą nogę w bok, zegnij prawe kolano, wypchnij biodra do tyłu i skrzyżuj ręce z przodu.\n" +
                "3. Wróć do pozycji wyjściowej i powtórz ruch lewą nogą.\n" +
                "4. Utrzymuj naprzemienne nogi, aż seria będzie kompletna.",
            "Wykrok ze skrzyżowanymi ramionami celuje w pośladki, mięśnie czworogłowe, ścięgna podkolanowe i wewnętrzne uda oraz rozciąga ramiona, ramiona, klatkę piersiową i górną część pleców. To ćwiczenie zapewnia doskonałe przyspieszenie cardio, poprawia równowagę dynamiczną i zwinność oraz zwiększa elastyczność.",
            Difficulty.BEGINNER, R.drawable.arms_cross_side_lunge_beginner),
        Workout("Wymachy ramion", "1. Stań prosto z lekko ugiętymi kolanami, stopami rozstawionymi na szerokość barków i ramionami wyciągniętymi poziomo na boki.\n" +
                "2. Skrzyżuj ręce z przodu, a następnie szybko cofnij je jak najdalej.\n" +
                "3. Powtarzaj ten ruch tam iz powrotem, aż seria zostanie zakończona.",
            "Wymachy ramion to świetne dynamiczne ćwiczenie rozciągające, które angażuje mięśnie górnej części ciała. To ćwiczenie rozgrzewa i rozciąga ramiona, ramiona, klatkę piersiową i górną część pleców oraz przygotowuje mięśnie, ścięgna i stawy do treningu. To ćwiczenie zapewnia również doskonałe przyspieszenie cardio i zwiększa elastyczność.",
            Difficulty.BEGINNER, R.drawable.arm_swings_beginner),
        Workout("Rozciąganie bicepsów", "1. Stań prosto i spleć ręce za plecami.\n" +
                "2. Wyprostuj ręce i obróć dłonie tak, aby dłonie były skierowane w dół.\n" +
                "3. Podnieś ramiona i wytrzymaj przez 10 do 20 sekund.",
            "Bicepsy w znacznym stopniu przyczyniają się do siły ramion, dlatego bardzo ważne jest utrzymanie ich w zdrowiu i bez kontuzji. Aby poprawić zakres ruchu oraz zwiększyć siłę i elastyczność mięśni, upewnij się, że zawsze rozciągasz bicepsy po treningu górnej części ciała. Rozciąganie bicepsów na stojąco może również pomóc zmniejszyć bolesność i napięcie w klatce piersiowej i ramionach.",
            Difficulty.BEGINNER, R.drawable.biceps_stretch_beginner),
        Workout("Zaawansowany mostek", "1. Usiądź na macie z ugiętymi kolanami, rękami wyciągniętymi do tyłu i palcami skierowanymi w stronę ciała.\n" +
                "2. Podnieś swój tyłek z maty, przechodząc do pozycji blatu.\n" +
                "3. Opuść biodra, wróć do pozycji wyjściowej i powtórz.",
            "Zaawansowany mostek to zmodyfikowana wersja mostka pośladkowego, który celuje i trenuje pośladki. To ćwiczenie angażuje również ramiona i rdzeń oraz pomaga tonizować i wzmacniać te mięśnie.",
            Difficulty.ADVANCED, R.drawable.advanced_bridge_advanced),
        Workout("Brzuszki rowerowe", "1. Połóż się na plecach, unieś ramiona z maty i unieś obie nogi.\n" +
                "2. Zbliż jedno kolano i przeciwny łokieć do siebie, uginając się w jedną stronę, i całkowicie wyprostuj drugą nogę.\n" +
                "3. Wróć do pozycji wyjściowej, a następnie wykonaj brzuszek na drugą stronę.\n" +
                "4. Powtarzaj, aż zestaw będzie kompletny.",
            "Dodanie brzuszków rowerowych do rutynowego treningu pomaga zwiększyć siłę rdzenia, wyszczupla talię oraz poprawia stabilność i elastyczność. To ćwiczenie działa na mięśnie brzucha i mięśnie skośne, a ponieważ utrzymuje ciało w ciągłym ruchu, przyspiesza tętno i spala jeszcze więcej kalorii.",
            Difficulty.ADVANCED, R.drawable.bicycle_crunches_advanced),
        Workout("Uderzenia piętami", "1. Połóż się na brzuchu z całkowicie wyprostowanymi nogami, rękami pod brodą i unieś nogi kilka cali nad podłogę.\n" +
                "2. Uderzaj piętami, aż zestaw będzie kompletny.",
            "Uderzenia piętami to ruch pilates, który celuje w pośladki i ścięgna podkolanowe i pomaga wyszczuplić nogi. To ćwiczenie wzmacnia, tonizuje i rzeźbi tylne mięśnie łańcuchowe, wydłuża ścięgna podkolanowe i pomaga uniknąć kontuzji.",
            Difficulty.ADVANCED, R.drawable.heel_beats_advanced),
        Workout("Heisman", "1. Stań prosto ze stopami rozstawionymi na szerokość bioder i lekko ugiętymi kolanami.\n" +
                "2. Wskocz na prawą stopę i podciągnij lewe kolano do góry w kierunku prawego ramienia.\n" +
                "3. Wskocz na lewą stopę i podciągnij prawe kolano do lewego barku.\n" +
                "4. Kontynuuj przeskakiwanie między stopami, aż seria zostanie zakończona.",
            "Heisman to ruch plyometryczny, który pomaga rozwinąć zwinność, równowagę i elastyczność. To ćwiczenie zapewnia doskonałe przyspieszenie cardio i pomaga poprawić wytrzymałość, wytrzymałość i poziom sprawności.",
            Difficulty.ADVANCED, R.drawable.heisman_advanced),
        Workout("Podciąganie w kroku bocznym", "1. Zacznij od rozstawienia stóp nieco szerzej niż na szerokość barków i unieś obie ręce nad głowę.\n" +
                "2. Zrób duży krok do tyłu lewą nogą, krzyżując ją w prawo, zegnij przednie kolano i odciągnij ręce do tyłu.\n" +
                "3. Wróć do pozycji wyjściowej i powtórz po przeciwnej stronie.",
            "Podciąganie w kroku bocznym to ćwiczenie kardio, które utrzymuje tętno na wysokim poziomie, rozgrzewa mięśnie i stawy oraz przyspiesza metabolizm. To ćwiczenie aktywizuje wszystkie grupy mięśniowe, poprawia wytrzymałość mięśni i sprzyja relaksacji.",
            Difficulty.ADVANCED, R.drawable.lateral_step_pull_advanced),
        Workout("Kopnięcia z wykroku", "1. Zacznij od złączonych stóp, cofnij się prawą nogą i wykonaj wypad.\n" +
                "2. Podchodząc, podnieś prawą nogę.\n" +
                "3. Wróć do pozycji wyjściowej i powtórz z lewą nogą.\n" +
                "4. Utrzymuj naprzemienne nogi, aż do zakończenia zestawu.",
            "Wykonywanie kopnięć z wykroku pozwala pracować na nogach i pośladkach, zapewniając jednocześnie doskonałe przyspieszenie cardio i poważny trening rdzenia. Ćwiczenia z kopnięciami rzucają wyzwanie twojej stabilności i elastyczności i mogą pomóc ci je zwiększyć.",
            Difficulty.ADVANCED, R.drawable.lunge_kicks_advanced)
    )
}