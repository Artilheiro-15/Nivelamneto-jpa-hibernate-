����   = H  dominio/Pessoa  java/lang/Object  java/io/Serializable serialVersionUID J 
ConstantValue        id Ljava/lang/Integer; RuntimeVisibleAnnotations Ljavax/persistence/Id; "Ljavax/persistence/GeneratedValue; strategy "Ljavax/persistence/GenerationType; IDENTITY nome Ljava/lang/String; email <init> ()V Code
     LineNumberTable LocalVariableTable this Ldominio/Pessoa; :(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V	  "  
	  $  	  &   getId ()Ljava/lang/Integer; setId (Ljava/lang/Integer;)V getNome ()Ljava/lang/String; setNome (Ljava/lang/String;)V getEmail setEmail toString 3 java/lang/StringBuilder 5 Pessoa id= 
 2 7  .
 2 9 : ; append -(Ljava/lang/Object;)Ljava/lang/StringBuilder; = , nome= 
 2 ? : @ -(Ljava/lang/String;)Ljava/lang/StringBuilder; B 	, email =
 2 D 1 , 
SourceFile Pessoa.java Ljavax/persistence/Entity; !          	    
   
            e             	        3     *� �       
                           l     *� *+� !*,� #*-� %�              	         *             
               ' (     /     *� !�           !              ) *     >     *+� !�       
    %  &                 
   + ,     /     *� #�           )              - .     >     *+� #�       
    -  .                    / ,     /     *� %�           1              0 .     >     *+� %�       
    5  6                    1 ,     V     ,� 2Y4� 6*� !� 8<� >*� #� >A� >*� %� >� C�           :        ,      E    F      G  