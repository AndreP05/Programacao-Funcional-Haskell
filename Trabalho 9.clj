; André Pacheco dos Santos

; 1. Utilizando  a  linguagem  Clojure,  crie  uma  função  chamada  ultimo  que  receba  uma  lista  e devolva o último elemento desta lista sem usar as funções já prontas e disponíveis para esta mesma finalidade na linguagem Clojure.
(defn ultimo [arg] 
  (nth arg (- (count arg) 1))
)

(println (ultimo [2 1 6 8 9]))

; 2. Utilizando a linguagem Clojure, crie uma função chamada penultimo que receba uma lista e  devolva  o  penúltimo  elemento  desta  lista  usar as  funções  já  prontas  e disponíveis para esta mesma finalidade na linguagem Clojure.
(defn penultimo [arg] 
  (nth arg (- (- (count arg) 1) 1))
)

(println (penultimo [2 1 6 8 9]))

; 3. Utilizando a linguagem Clojure, crie uma função chamada elementoN que receba uma lista e um inteiro N e devolva o  elemento que  está na  posição N desta lista usar as funções já prontas e disponíveis para esta mesma finalidade na linguagem Clojure.
(defn elementoN [lista n]
  (loop [i n listax lista]
    (if (== i 0)
      (first listax)
      (recur (- i 1) (rest listax))
    )
  )
)

(println (elementoN [2 1 6 8 9] 2))

; 4. Utilizando  a  linguagem Clojure,  crie  uma função  chamada  inverso  que  receba uma  lista  e devolva esta lista com as posições dos elementos invertidas. Por exemplo recebe [1,2,3] e devolve [3,2,1]. Sem usar as funções já prontas e disponíveis para esta mesma finalidade na linguagem Clojure.
(defn inverso [arg]
  (loop [arg arg acc (empty arg)]
    (if (empty? arg)
      acc (recur (rest arg) (cons (first arg) acc))
    )
  )
)

(println (inverso [5 4 3 2 1]) )
