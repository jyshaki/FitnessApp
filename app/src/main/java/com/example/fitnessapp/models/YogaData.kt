package com.example.fitnessapp.models

import com.example.fitnessapp.R

object YogaData {
    val allYoga = listOf(
        YogaPose("Pozycja sfinksa", "1. Połóż się na brzuchu z nogami wyciągniętymi do tyłu i przedramionami płasko na podłodze.\n" +
                "2. Wykonaj wdech, opuść przedramiona i unieś głowę i klatkę piersiową z podłogi.\n" +
                "3. Utrzymaj pozycję przez kilka oddechów, a następnie wydychaj, powoli opuszczając klatkę piersiową i wracając na podłogę.",
            "Korzyści z Salamba Bhujangasana: Pozycja sfinksa wyrównuje kręgosłup, otwiera klatkę piersiową, rozciąga ramiona i wzmacnia rdzeń i pośladki. Ta pozycja stymuluje również narządy jamy brzusznej i łagodzi stres i napięcie.",
            Difficulty.BEGINNER, R.drawable.sphinx_pose_beginner),
        YogaPose("Pozycja łuku", "1. Zacznij w pozycji sfinksa, ugnij kolana i chwyć kostki.\n" +
                "2. Podczas wdechu unieś biodra i klatkę piersiową z podłogi.\n" +
                "3. Podczas wydechu podnieś wzrok i unieś stopy do góry.\n" +
                "4. Pozostań w ukłonie przez 20 do 30 sekund.",
            "Korzyści z Dhanurasany: Pozycja łuku to wygięcie do tyłu, które otwiera klatkę piersiową, ramiona i biodra. Ta pozycja wzmacnia górną część pleców, masuje narządy wewnętrzne i łagodzi stres i napięcie.",
            Difficulty.BEGINNER, R.drawable.bow_pose_beginner),
        YogaPose("Pozycja górska", "1. Stań prosto ze złączonymi stopami, z długim kręgosłupem i miękkim ciałem.\n" +
                "2. Złącz dłonie przed sercem.\n" +
                "3. Pozostań w tadasanie od 30 sekund do 1 minuty.",
            "Korzyści z Tadasany: Górska pozycja lub Tadasana pomaga poprawić postawę, wzmacnia nogi, uda, kolana i kostki oraz ujędrnia brzuch i pośladki.",
            Difficulty.BEGINNER, R.drawable.mountain_pose_beginner),
        YogaPose("Pozycja wojownika II", "1. Zacznij w pozycji górskiej, zrób lewą stopę w bok i obróć ją do kąta 90 stopni.\n" +
                "2. Zegnij lewe kolano, utrzymując je w jednej linii z kostką.\n" +
                "3. Obróć głowę w lewo, unieś ręce na wysokość barków i trzymaj je równolegle do podłogi, z dłońmi skierowanymi w dół.\n" +
                "4. Utrzymaj pozycję przez 30 sekund do 1 minuty, odwróć stopy i powtórz.",
            "Korzyści z Virabhadrasany II: Virabhadrasana II rozciąga ramiona, klatkę piersiową i pachwiny oraz wzmacnia nogi i kostki. Ta pozycja stymuluje narządy jamy brzusznej i poprawia równowagę i wytrzymałość.",
            Difficulty.BEGINNER, R.drawable.warrior_ii_pose_beginner),
        YogaPose("Pozycja półksiężyca", "1. Rozpocznij w pozycji górskiej i podczas wydechu rozstaw szeroko stopy.\n" +
                "2. Obróć prawą stopę do kąta 90 stopni i wykonaj wdech, unosząc ręce na boki, aż znajdą się równolegle do podłogi.\n" +
                "3. Zrób wydech, opierając prawą rękę na podłodze, podnieś lewą nogę, wyciągnij lewe ramię w kierunku sufitu i spójrz na lewy kciuk.\n" +
                "4. Utrzymaj pozycję przez 30 sekund do 1 minuty, a następnie powtórz po lewej stronie.",
            "Korzyści Ardha Chandrasana: Pozycja półksiężyca tonizuje i stymuluje narządy jamy brzusznej, poprawia koordynację i równowagę oraz łagodzi napięcie.",
            Difficulty.BEGINNER, R.drawable.half_moon_pose_beginner),
        YogaPose("Pozycja drzewa", "1. Zacznij w pozycji górskiej, przenieś ciężar ciała na lewą stopę, zegnij prawe kolano i chwyć prawą kostkę.\n" +
                "2. Umieść podeszwę prawej stopy na wewnętrznej stronie lewego uda.\n" +
                "3. Wydłuż tułów, unieś ręce nad głowę i złącz dłonie.\n" +
                "4. Utrzymaj pozycję przez 30 sekund do 1 minuty, odwróć nogi i powtórz.",
            "Korzyści z Vrksasany: Pozycja drzewa rozciąga ramiona, klatkę piersiową, wewnętrzne uda i pachwiny oraz wzmacnia nogi i kręgosłup. Ta pozycja poprawia również równowagę, koncentrację i skupienie.",
            Difficulty.BEGINNER, R.drawable.tree_pose_beginner),
        YogaPose("Łatwa poza", "1. Usiądź na podłodze z nogami wyciągniętymi przed siebie.\n" +
                "2. Skrzyżuj nogi, umieść każdą stopę pod przeciwległym kolanem i wydłuż kręgosłup.\n" +
                "3. Pozostań w Sukhasanie tak długo, jak chcesz.",
            "Korzyści z Sukhasany: Łatwa pozycja relaksuje i uspokaja umysł, zmniejsza poziom stresu i niepokoju oraz promuje spokój i pogodę ducha. Ta pozycja poprawia również wyrównanie kręgosłupa, rozciąga kolana i kostki oraz łagodzi napięcie bioder.",
            Difficulty.ADVANCED, R.drawable.easy_pose_advanced),
        YogaPose("Pozycja skłonu do przodu od głowy do kolana", "1. Usiądź na podłodze ze złączonymi stopami i wyprostowanymi nogami.\n" +
                "2. Zegnij prawe kolano i zbliż podeszwę prawej stopy do lewego uda.\n" +
                "3. Zrób wydech, pochylając się w biodrach, powoli opuść tułów i chwyć lewą stopę.\n" +
                "4. Utrzymaj pozycję przez 30 sekund do 1 minuty, a następnie zmień stronę.",
            "Korzyści z Janu Sirsasany: Ta poza uspokaja ośrodkowy układ nerwowy, zmniejsza stres i łagodzi niepokój i łagodną depresję.",
            Difficulty.ADVANCED, R.drawable.head_to_knee_forward_bend_pose_advanced),
        YogaPose("Pozycja bramy", "1. Uklęknij na podłodze i wyciągnij prawą nogę na bok.\n" +
                "2. Pochyl tułów w prawo i połóż prawą rękę na goleni.\n" +
                "3. Wyciągnij lewe ramię ponad czubkiem głowy, skieruj palce w tym samym kierunku co palce prawej stopy i spójrz w górę, w stronę sufitu.\n" +
                "4. Pozostań w pozycji bramy przez 30 sekund do 1 minuty, a następnie powtórz po przeciwnej stronie.",
            "Korzyści z Parighasany: Pozycja bramy wzmacnia i rozciąga mięśnie skośne, wewnętrzne uda, ścięgna podkolanowe i kręgosłup. Ta pozycja pomaga również poprawić elastyczność i stymuluje mięśnie klatki piersiowej i brzucha oraz narządy.",
            Difficulty.ADVANCED, R.drawable.gate_pose_advanced),
        YogaPose("Pozycja skłonu do przodu z szerokimi nogami", "1. Rozpocznij w pozycji górskiej i podczas wydechu rozstaw szeroko stopy.\n" +
                "2. Pochyl się do przodu, obracając stawy biodrowe, połóż dłonie na podłodze, zegnij łokcie i opuść głowę i tułów.\n" +
                "3. Pozostań w pozycji skłonu do przodu z szeroko rozstawionymi nogami przez 30 sekund do 1 minuty.",
            "Korzyści z Prasarita Padottanasana: Wygięcie do przodu z szerokimi nogami wzmacnia i rozciąga nogi i kręgosłup. Ta pozycja tonizuje i stymuluje narządy jamy brzusznej, zmniejsza ból pleców oraz łagodzi stres i napięcie.",
            Difficulty.ADVANCED, R.drawable.wide_legged_forward_bend_pose_advanced),
        YogaPose("Skręt w skłonie do przodu z szerokimi nogami", "1. Zacznij od wygięcia do przodu z szeroko rozstawionymi nogami, a następnie przesuń prawą rękę na środek maty.\n" +
                "2. Podczas wdechu wyciągnij lewą rękę w kierunku sufitu, skręć tułów w lewo i obróć głowę, aby podążać za ramieniem.\n" +
                "3. Pozostań w skręcie z szeroko rozstawionymi nogami do przodu przez 30 sekund, a następnie zmień strony.",
            "Korzyści z Parivrtta Prasarita Padottanasana: Ta pozycja stymuluje narządy jamy brzusznej, poprawia trawienie i pomaga w detoksykacji organizmu.",
            Difficulty.ADVANCED, R.drawable.wide_legged_forward_bend_twist_pose_advanced),
        YogaPose("Pozycja stojąca w skłonie do przodu", "1. Stań prosto i pochyl się do przodu, obracając stawy biodrowe.\n" +
                "2. Trzymaj kolana prosto i połóż dłonie na podłodze lub chwyć za kostki.\n" +
                "3. Pozostań w skłonie do przodu przez 30 sekund do 1 minuty.",
            "Korzyści z Uttanasany: Wygięcie do przodu na stojąco lub Uttanasana to pozycja jogi, która pomaga poprawić krążenie, zwiększa elastyczność kręgosłupa i zmniejsza nagromadzony stres i napięcie. Ta pozycja pomaga również rozciągnąć ścięgna podkolanowe, łydki i biodra oraz wzmacnia uda i kolana.",
            Difficulty.ADVANCED, R.drawable.standing_forward_bend_pose_advanced),
        YogaPose("Pozycja stojąca w rozkroku", "1. Zacznij w pozycji górskiej, zegnij biodra i połóż obie ręce na podłodze.\n" +
                "2. Przenieś ciężar ciała na lewą stopę i powoli wyprostuj prawą nogę do góry i do tyłu.\n" +
                "3. Lewą ręką chwyć tył lewej nogi i połóż tułów na lewym udzie.\n" +
                "4. Pozostań w pozycji stojącej szpagatu przez 30 sekund, wróć do skłonu do przodu stojąc, odwróć pozycję nóg i powtórz.",
            "Korzyści z Urdhva Prasarita Eka Padasana: Stojąca pozycja szpagatu rozciąga tył nóg, wzmacnia uda i zwiększa elastyczność kręgosłupa. Jest to bardzo kojąca pozycja, która pomaga uspokoić mózg i łagodzi nagromadzony stres i napięcie.",
            Difficulty.ADVANCED, R.drawable.standing_split_pose_advanced)
    )
}