package com.ruan.alg.leetcode.leetcode.q5;

/**
 * 学习一下最速传说
 * 讲道理这个中心扩散的逻辑算法不应该这么快，这可能与用例有关
 * 时间上来说介于O(n)和O(n^2)之间，接近O(n^2)
 * <p>
 * 请用循环，不要用递归，n过长的时候栈堆会原地爆炸
 */
public class Solution3 {

    public static void main(String[] args) {
        Solution3 solution3 = new Solution3();
        long begin = System.currentTimeMillis();
        System.out.println(solution3.longestPalindrome("对我个人而言，科学和人文谁更有意义不仅仅是一个重大的事件，还可能会改变我的人生。 科学和人文谁更有意义，发生了会如何，不发生又会如何。 那么， 这种事实对本人来说意义重大，相信对这个世界也是有一定意义的。 带着这些问题，我们来审视一下科学和人文谁更有意义。 我们都知道，只要有意义，那么就必须慎重考虑。 总结的来说， 科学和人文谁更有意义，到底应该如何实现。 我们都知道，只要有意义，那么就必须慎重考虑。 塞涅卡曾经提到过，真正的人生，只有在经过艰难卓绝的斗争之后才能实现。这似乎解答了我的疑惑。 在这种困难的抉择下，本人思来想去，寝食难安。 既然如何， 而这些并不是完全重要，更加重要的问题是， 一般来讲，我们都必须务必慎重的考虑考虑。 现在，解决科学和人文谁更有意义的问题，是非常非常重要的。 所以， 要想清楚，科学和人文谁更有意义，到底是一种怎么样的存在。 我们一般认为，抓住了问题的关键，其他一切则会迎刃而解。 问题的关键究竟为何？ 乌申斯基曾经提到过，学习是劳动，是充满思想的劳动。这句话语虽然很短，但令我浮想联翩。 那么， 问题的关键究竟为何？ 要想清楚，科学和人文谁更有意义，到底是一种怎么样的存在。 对我个人而言，科学和人文谁更有意义不仅仅是一个重大的事件，还可能会改变我的人生。 我们一般认为，抓住了问题的关键，其他一切则会迎刃而解。 吕凯特曾经提到过，生命不可能有两次，但许多人连一次也不善于度过。这似乎解答了我的疑惑。 经过上述讨论， 问题的关键究竟为何？ 我们都知道，只要有意义，那么就必须慎重考虑。 既然如此， 一般来讲，我们都必须务必慎重的考虑考虑。 所谓科学和人文谁更有意义，关键是科学和人文谁更有意义需要如何写。 一般来讲，我们都必须务必慎重的考虑考虑。 了解清楚科学和人文谁更有意义到底是一种怎么样的存在，是解决一切问题的关键。 要想清楚，科学和人文谁更有意义，到底是一种怎么样的存在。 所谓科学和人文谁更有意义，关键是科学和人文谁更有意义需要如何写。 对我个人而言，科学和人文谁更有意义不仅仅是一个重大的事件，还可能会改变我的人生。 现在，解决科学和人文谁更有意义的问题，是非常非常重要的。 所以。\n" +
                "　　我们都知道，只要有意义，那么就必须慎重考虑。 每个人都不得不面对这些问题。 在面对这种问题时， 对我个人而言，科学和人文谁更有意义不仅仅是一个重大的事件，还可能会改变我的人生。 歌德曾经提到过，没有人事先了解自己到底有多大的力量，直到他试过以后才知道。这似乎解答了我的疑惑。 而这些并不是完全重要，更加重要的问题是， 就我个人来说，科学和人文谁更有意义对我的意义，不能不说非常重大。 迈克尔·F·斯特利曾经提到过，最具挑战性的挑战莫过于提升自我。这不禁令我深思。 从这个角度来看， 我们一般认为，抓住了问题的关键，其他一切则会迎刃而解。 这种事实对本人来说意义重大，相信对这个世界也是有一定意义的。 莎士比亚在不经意间这样说过，那脑袋里的智慧，就像打火石里的火花一样，不去打它是不肯出来的。我希望诸位也能好好地体会这句话。 池田大作说过一句富有哲理的话，不要回避苦恼和困难，挺起身来向它挑战，进而克服它。这似乎解答了我的疑惑。 罗素·贝克曾经说过，一个人即使已登上顶峰，也仍要自强不息。我希望诸位也能好好地体会这句话。 带着这些问题，我们来审视一下科学和人文谁更有意义。 既然如何， 我们都知道，只要有意义，那么就必须慎重考虑。 我们不得不面对一个非常尴尬的事实，那就是， 一般来说， 马尔顿曾经说过，坚强的信心，能使平凡的人做出惊人的事业。这似乎解答了我的疑惑。 我们一般认为，抓住了问题的关键，其他一切则会迎刃而解。 问题的关键究竟为何？ 这种事实对本人来说意义重大，相信对这个世界也是有一定意义的。 对我个人而言，科学和人文谁更有意义不仅仅是一个重大的事件，还可能会改变我的人生。 这样看来， 所谓科学和人文谁更有意义，关键是科学和人文谁更有意义需要如何写。 所谓科学和人文谁更有意义，关键是科学和人文谁更有意义需要如何写。 可是，即使是这样，科学和人文谁更有意义的出现仍然代表了一定的意义。 就我个人来说，科学和人文谁更有意义对我的意义，不能不说非常重大。 这种事实对本人来说意义重大，相信对这个世界也是有一定意义的。 西班牙曾经说过，自己的鞋子，自己知道紧在哪里。我希望诸位也能好好地体会这句话。 这样看来， 科学和人文谁更有意义，到底应该如何实现。 我们都知道，只要有意义，那么就必须慎重考虑。 所谓科学和人文谁更有意义，关键是科学和人文谁更有意义需要如何写。\n" +
                "　　我们一般认为，抓住了问题的关键，其他一切则会迎刃而解。 经过上述讨论， 我认为， 就我个人来说，科学和人文谁更有意义对我的意义，不能不说非常重大。 就我个人来说，科学和人文谁更有意义对我的意义，不能不说非常重大。 那么， 每个人都不得不面对这些问题。 在面对这种问题时， 爱尔兰曾经说过，越是无能的人，越喜欢挑剔别人的错儿。带着这句话，我们还要更加慎重的审视这个问题： 在这种困难的抉择下，本人思来想去，寝食难安。 那么， 科学和人文谁更有意义，发生了会如何，不发生又会如何。 问题的关键究竟为何？ 带着这些问题，我们来审视一下科学和人文谁更有意义。 从这个角度来看， 而这些并不是完全重要，更加重要的问题是， 我们都知道，只要有意义，那么就必须慎重考虑。 生活中，若科学和人文谁更有意义出现了，我们就不得不考虑它出现了的事实。 我认为， 科学和人文谁更有意义的发生，到底需要如何做到，不科学和人文谁更有意义的发生，又会如何产生。 问题的关键究竟为何？ 既然如此， 既然如何， 达·芬奇曾经说过，大胆和坚定的决心能够抵得上武器的精良。带着这句话，我们还要更加慎重的审视这个问题： 在这种困难的抉择下，本人思来想去，寝食难安。 德国曾经提到过，只有在人群中间，才能认识自己。我希望诸位也能好好地体会这句话。 这样看来， 一般来说， 从这个角度来看， 生活中，若科学和人文谁更有意义出现了，我们就不得不考虑它出现了的事实。 要想清楚，科学和人文谁更有意义，到底是一种怎么样的存在。 科学和人文谁更有意义因何而发生？ 屠格涅夫曾经提到过，你想成为幸福的人吗？但愿你首先学会吃得起苦。这似乎解答了我的疑惑。 我们都知道，只要有意义，那么就必须慎重考虑。 科学和人文谁更有意义因何而发生？ 了解清楚科学和人文谁更有意义到底是一种怎么样的存在，是解决一切问题的关键。 对我个人而言，科学和人文谁更有意义不仅仅是一个重大的事件，还可能会改变我的人生。 这样看来， 这样看来， 总结的来说。\n" +
                "　　了解清楚科学和人文谁更有意义到底是一种怎么样的存在，是解决一切问题的关键。 我们不得不面对一个非常尴尬的事实，那就是， 所谓科学和人文谁更有意义，关键是科学和人文谁更有意义需要如何写。 一般来讲，我们都必须务必慎重的考虑考虑。 既然如此， 卢梭说过一句富有哲理的话，浪费时间是一桩大罪过。这句话语虽然很短，但令我浮想联翩。 我们都知道，只要有意义，那么就必须慎重考虑。 那么， 别林斯基曾经提到过，好的书籍是最贵重的珍宝。这启发了我， 老子在不经意间这样说过，知人者智，自知者明。胜人者有力，自胜者强。这启发了我， 我认为， 既然如何， 可是，即使是这样，科学和人文谁更有意义的出现仍然代表了一定的意义。 现在，解决科学和人文谁更有意义的问题，是非常非常重要的。 所以， 科学和人文谁更有意义，到底应该如何实现。\n" +
                "　　我们一般认为，抓住了问题的关键，其他一切则会迎刃而解。 了解清楚科学和人文谁更有意义到底是一种怎么样的存在，是解决一切问题的关键。 就我个人来说，科学和人文谁更有意义对我的意义，不能不说非常重大。 既然如此， 科学和人文谁更有意义，发生了会如何，不发生又会如何。 就我个人来说，科学和人文谁更有意义对我的意义，不能不说非常重大。 达尔文说过一句富有哲理的话，敢于浪费哪怕一个钟头时间的人，说明他还不懂得珍惜生命的全部价值。这似乎解答了我的疑惑。 老子曾经说过，知人者智，自知者明。胜人者有力，自胜者强。这句话语虽然很短，但令我浮想联翩。 而这些并不是完全重要，更加重要的问题是， 总结的来说， 要想清楚，科学和人文谁更有意义，到底是一种怎么样的存在。\n" +
                "　　我们都知道，只要有意义，那么就必须慎重考虑。 我认为， 可是，即使是这样，科学和人文谁更有意义的出现仍然代表了一定的意义。 科学和人文谁更有意义的发生，到底需要如何做到，不科学和人文谁更有意义的发生，又会如何产生。 而这些并不是完全重要，更加重要的问题是， 科学和人文谁更有意义，到底应该如何实现。 我认为， 而这些并不是完全重要，更加重要的问题是， 本人也是经过了深思熟虑，在每个日日夜夜思考这个问题。 就我个人来说，科学和人文谁更有意义对我的意义，不能不说非常重大。 带着这些问题，我们来审视一下科学和人文谁更有意义。 从这个角度来看， 既然如何， 我们一般认为，抓住了问题的关键，其他一切则会迎刃而解。 带着这些问题，我们来审视一下科学和人文谁更有意义。 带着这些问题，我们来审视一下科学和人文谁更有意义。 科学和人文谁更有意义的发生，到底需要如何做到，不科学和人文谁更有意义的发生，又会如何产生。 对我个人而言，科学和人文谁更有意义不仅仅是一个重大的事件，还可能会改变我的人生。 科学和人文谁更有意义的发生，到底需要如何做到，不科学和人文谁更有意义的发生，又会如何产生。 带着这些问题，我们来审视一下科学和人文谁更有意义。 拿破仑·希尔说过一句富有哲理的话，不要等待，时机永远不会恰到好处。这句话语虽然很短，但令我浮想联翩。 我们都知道，只要有意义，那么就必须慎重考虑。 这样看来， 可是，即使是这样，科学和人文谁更有意义的出现仍然代表了一定的意义。 我认为， 爱迪生在不经意间这样说过，失败也是我需要的，它和成功对我一样有价值。这似乎解答了我的疑惑。 科学和人文谁更有意义，发生了会如何，不发生又会如何。 每个人都不得不面对这些问题。 在面对这种问题时， 我们不得不面对一个非常尴尬的事实，那就是， 一般来说。\n" +
                "　　本人也是经过了深思熟虑，在每个日日夜夜思考这个问题。 我们一般认为，抓住了问题的关键，其他一切则会迎刃而解。 要想清楚，科学和人文谁更有意义，到底是一种怎么样的存在。 在这种困难的抉择下，本人思来想去，寝食难安。 这样看来， 韩非说过一句富有哲理的话，内外相应，言行相称。我希望诸位也能好好地体会这句话。 就我个人来说，科学和人文谁更有意义对我的意义，不能不说非常重大。 现在，解决科学和人文谁更有意义的问题，是非常非常重要的。 所以， 拉罗什福科曾经提到过，我们唯一不会改正的缺点是软弱。我希望诸位也能好好地体会这句话。 了解清楚科学和人文谁更有意义到底是一种怎么样的存在，是解决一切问题的关键。 卡耐基说过一句富有哲理的话，我们若已接受最坏的，就再没有什么损失。这启发了我， 要想清楚，科学和人文谁更有意义，到底是一种怎么样的存在。 一般来说。\n" +
                "　　科学和人文谁更有意义，发生了会如何，不发生又会如何。 总结的来说， 每个人都不得不面对这些问题。 在面对这种问题时， 现在，解决科学和人文谁更有意义的问题，是非常非常重要的。 所以， 带着这些问题，我们来审视一下科学和人文谁更有意义。 对我个人而言，科学和人文谁更有意义不仅仅是一个重大的事件，还可能会改变我的人生。 我们不得不面对一个非常尴尬的事实，那就是， 对我个人而言，科学和人文谁更有意义不仅仅是一个重大的事件，还可能会改变我的人生。 这样看来， 了解清楚科学和人文谁更有意义到底是一种怎么样的存在，是解决一切问题的关键。 一般来讲，我们都必须务必慎重的考虑考虑。 我们一般认为，抓住了问题的关键，其他一切则会迎刃而解。 一般来讲，我们都必须务必慎重的考虑考虑。 总结的来说， 生活中，若科学和人文谁更有意义出现了，我们就不得不考虑它出现了的事实。 那么， 要想清楚，科学和人文谁更有意义，到底是一种怎么样的存在。 科学和人文谁更有意义因何而发生？ 我们不得不面对一个非常尴尬的事实，那就是， 塞内加曾经提到过，勇气通往天堂，怯懦通往地狱。这不禁令我深思。 每个人都不得不面对这些问题。 在面对这种问题时， 而这些并不是完全重要，更加重要的问题是， 那么， 本人也是经过了深思熟虑，在每个日日夜夜思考这个问题。 这样看来， 一般来说， 科学和人文谁更有意义因何而发生？ 对我个人而言，科学和人文谁更有意义不仅仅是一个重大的事件，还可能会改变我的人生。 要想清楚，科学和人文谁更有意义，到底是一种怎么样的存在。 要想清楚，科学和人文谁更有意义，到底是一种怎么样的存在。 要想清楚，科学和人文谁更有意义，到底是一种怎么样的存在。 科学和人文谁更有意义，到底应该如何实现。 科学和人文谁更有意义，到底应该如何实现。\n" +
                "　　现在，解决科学和人文谁更有意义的问题，是非常非常重要的。 所以， 既然如何， 乌申斯基曾经说过，学习是劳动，是充满思想的劳动。我希望诸位也能好好地体会这句话。 吉格·金克拉说过一句富有哲理的话，如果你能做梦，你就能实现它。这句话语虽然很短，但令我浮想联翩。 带着这些问题，我们来审视一下科学和人文谁更有意义。 王阳明在不经意间这样说过，故立志者，为学之心也；为学者，立志之事也。带着这句话，我们还要更加慎重的审视这个问题： 我们一般认为，抓住了问题的关键，其他一切则会迎刃而解。 从这个角度来看。\n" +
                "　　从这个角度来看， 科学和人文谁更有意义，发生了会如何，不发生又会如何。 科学和人文谁更有意义，到底应该如何实现。 科学和人文谁更有意义，到底应该如何实现。 老子曾经提到过，知人者智，自知者明。胜人者有力，自胜者强。这句话语虽然很短，但令我浮想联翩。 了解清楚科学和人文谁更有意义到底是一种怎么样的存在，是解决一切问题的关键。 所谓科学和人文谁更有意义，关键是科学和人文谁更有意义需要如何写。 生活中，若科学和人文谁更有意义出现了，我们就不得不考虑它出现了的事实。 我们一般认为，抓住了问题的关键，其他一切则会迎刃而解。 一般来讲，我们都必须务必慎重的考虑考虑。 带着这些问题，我们来审视一下科学和人文谁更有意义。 罗曼·罗兰说过一句富有哲理的话，只有把抱怨环境的心情，化为上进的力量，才是成功的保证。这启发了我， 卡莱尔在不经意间这样说过，过去一切时代的精华尽在书中。这句话语虽然很短，但令我浮想联翩。 了解清楚科学和人文谁更有意义到底是一种怎么样的存在，是解决一切问题的关键。 这样看来， 本人也是经过了深思熟虑，在每个日日夜夜思考这个问题。 对我个人而言，科学和人文谁更有意义不仅仅是一个重大的事件，还可能会改变我的人生。 本人也是经过了深思熟虑，在每个日日夜夜思考这个问题。 总结的来说， 一般来说， 所谓科学和人文谁更有意义，关键是科学和人文谁更有意义需要如何写。\n" +
                "　　吕凯特在不经意间这样说过，生命不可能有两次，但许多人连一次也不善于度过。带着这句话，我们还要更加慎重的审视这个问题： 要想清楚，科学和人文谁更有意义，到底是一种怎么样的存在。 那么， 本人也是经过了深思熟虑，在每个日日夜夜思考这个问题。 这样看来， 科学和人文谁更有意义因何而发生？ 经过上述讨论， 科学和人文谁更有意义因何而发生？ 既然如此， 我认为， 莎士比亚曾经说过，意志命运往往背道而驰，决心到最后会全部推倒。这不禁令我深思。 伏尔泰曾经提到过，坚持意志伟大的事业需要始终不渝的精神。这似乎解答了我的疑惑。 这种事实对本人来说意义重大，相信对这个世界也是有一定意义的。\n" +
                "　　拉罗什福科曾经提到过，我们唯一不会改正的缺点是软弱。带着这句话，我们还要更加慎重的审视这个问题： 了解清楚科学和人文谁更有意义到底是一种怎么样的存在，是解决一切问题的关键。 在这种困难的抉择下，本人思来想去，寝食难安。 而这些并不是完全重要，更加重要的问题是， 科学和人文谁更有意义，到底应该如何实现。 在这种困难的抉择下，本人思来想去，寝食难安。 本人也是经过了深思熟虑，在每个日日夜夜思考这个问题。 本人也是经过了深思熟虑，在每个日日夜夜思考这个问题。 本人也是经过了深思熟虑，在每个日日夜夜思考这个问题。 本人也是经过了深思熟虑，在每个日日夜夜思考这个问题。 这种事实对本人来说意义重大，相信对这个世界也是有一定意义的。 要想清楚，科学和人文谁更有意义，到底是一种怎么样的存在。 现在，解决科学和人文谁更有意义的问题，是非常非常重要的。 所以。\n" +
                "　　俾斯麦曾经提到过，对于不屈不挠的人来说，没有失败这回事。这句话语虽然很短，但令我浮想联翩。 经过上述讨论， 杰纳勒尔·乔治·S·巴顿在不经意间这样说过，接受挑战，就可以享受胜利的喜悦。这句话语虽然很短，但令我浮想联翩。 老子在不经意间这样说过，知人者智，自知者明。胜人者有力，自胜者强。这似乎解答了我的疑惑。 现在，解决科学和人文谁更有意义的问题，是非常非常重要的。 所以， 达·芬奇曾经提到过，大胆和坚定的决心能够抵得上武器的精良。我希望诸位也能好好地体会这句话。\n" +
                "　　了解清楚科学和人文谁更有意义到底是一种怎么样的存在，是解决一切问题的关键。 我们一般认为，抓住了问题的关键，其他一切则会迎刃而解。 所谓科学和人文谁更有意义，关键是科学和人文谁更有意义需要如何写。 在这种困难的抉择下，本人思来想去，寝食难安。 马云曾经提到过，最大的挑战和突破在于用人，而用人最大的突破在于信任人。带着这句话，我们还要更加慎重的审视这个问题： 我们不得不面对一个非常尴尬的事实，那就是， 一般来说， 生活中，若科学和人文谁更有意义出现了，我们就不得不考虑它出现了的事实。 可是，即使是这样，科学和人文谁更有意义的出现仍然代表了一定的意义。 可是，即使是这样，科学和人文谁更有意义的出现仍然代表了一定的意义。 莎士比亚说过一句富有哲理的话，本来无望的事，大胆尝试，往往能成功。我希望诸位也能好好地体会这句话。 我们一般认为，抓住了问题的关键，其他一切则会迎刃而解。 一般来说， 本人也是经过了深思熟虑，在每个日日夜夜思考这个问题。 问题的关键究竟为何？ 对我个人而言，科学和人文谁更有意义不仅仅是一个重大的事件，还可能会改变我的人生。 斯宾诺莎在不经意间这样说过，最大的骄傲于最大的自卑都表示心灵的最软弱无力。这启发了我， 我认为， 科学和人文谁更有意义，发生了会如何，不发生又会如何。\n" +
                "　　我们不得不面对一个非常尴尬的事实，那就是， 一般来说， 问题的关键究竟为何？ 我们一般认为，抓住了问题的关键，其他一切则会迎刃而解。 黑格尔曾经提到过，只有永远躺在泥坑里的人，才不会再掉进坑里。这句话语虽然很短，但令我浮想联翩。 既然如此， 从这个角度来看， 希腊曾经说过，最困难的事情就是认识自己。带着这句话，我们还要更加慎重的审视这个问题： 每个人都不得不面对这些问题。 在面对这种问题时， 每个人都不得不面对这些问题。 在面对这种问题时。\n" +
                "　　经过上述讨论， 就我个人来说，科学和人文谁更有意义对我的意义，不能不说非常重大。 我们一般认为，抓住了问题的关键，其他一切则会迎刃而解。 就我个人来说，科学和人文谁更有意义对我的意义，不能不说非常重大。 要想清楚，科学和人文谁更有意义，到底是一种怎么样的存在。 一般来讲，我们都必须务必慎重的考虑考虑。 科学和人文谁更有意义因何而发生？ 而这些并不是完全重要，更加重要的问题是， 可是，即使是这样，科学和人文谁更有意义的出现仍然代表了一定的意义。 既然如此， 要想清楚，科学和人文谁更有意义，到底是一种怎么样的存在。 生活中，若科学和人文谁更有意义出现了，我们就不得不考虑它出现了的事实。 科学和人文谁更有意义因何而发生？ 问题的关键究竟为何？ 科学和人文谁更有意义，到底应该如何实现。 对我个人而言，科学和人文谁更有意义不仅仅是一个重大的事件，还可能会改变我的人生。 郭沫若曾经说过，形成天才的决定因素应该是勤奋。这不禁令我深思。 这样看来， 科学和人文谁更有意义，到底应该如何实现。\n" +
                "　　达尔文说过一句富有哲理的话，敢于浪费哪怕一个钟头时间的人，说明他还不懂得珍惜生命的全部价值。这似乎解答了我的疑惑。 富勒在不经意间这样说过，苦难磨炼一些人，也毁灭另一些人。带着这句话，我们还要更加慎重的审视这个问题： 每个人都不得不面对这些问题。 在面对这种问题时， 贝多芬说过一句富有哲理的话，卓越的人一大优点是：在不利与艰难的遭遇里百折不饶。这不禁令我深思。 本人也是经过了深思熟虑，在每个日日夜夜思考这个问题。 亚伯拉罕·林肯说过一句富有哲理的话，我这个人走得很慢，但是我从不后退。我希望诸位也能好好地体会这句话。 生活中，若科学和人文谁更有意义出现了，我们就不得不考虑它出现了的事实。 现在，解决科学和人文谁更有意义的问题，是非常非常重要的。 所以， 在这种困难的抉择下，本人思来想去，寝食难安。 科学和人文谁更有意义，发生了会如何，不发生又会如何。 叔本华在不经意间这样说过，意志是一个强壮的盲人，倚靠在明眼的跛子肩上。这似乎解答了我的疑惑。 要想清楚，科学和人文谁更有意义，到底是一种怎么样的存在。 科学和人文谁更有意义的发生，到底需要如何做到，不科学和人文谁更有意义的发生，又会如何产生。 既然如何， 既然如何， 现在，解决科学和人文谁更有意义的问题，是非常非常重要的。 所以， 问题的关键究竟为何？ 本人也是经过了深思熟虑，在每个日日夜夜思考这个问题。 问题的关键究竟为何？ 一般来说， 叔本华说过一句富有哲理的话，普通人只想到如何度过时间，有才能的人设法利用时间。我希望诸位也能好好地体会这句话。 问题的关键究竟为何？ 要想清楚，科学和人文谁更有意义，到底是一种怎么样的存在。 那么， 苏轼在不经意间这样说过，古之立大事者，不惟有超世之才，亦必有坚忍不拔之志。这不禁令我深思。 科学和人文谁更有意义的发生，到底需要如何做到，不科学和人文谁更有意义的发生，又会如何产生。 苏轼曾经提到过，古之立大事者，不惟有超世之才，亦必有坚忍不拔之志。带着这句话，我们还要更加慎重的审视这个问题： 我认为， 了解清楚科学和人文谁更有意义到底是一种怎么样的存在，是解决一切问题的关键。 经过上述讨论， 每个人都不得不面对这些问题。 在面对这种问题时， 我们一般认为，抓住了问题的关键，其他一切则会迎刃而解。 每个人都不得不面对这些问题。 在面对这种问题时， 对我个人而言，科学和人文谁更有意义不仅仅是一个重大的事件，还可能会改变我的人生。 一般来讲，我们都必须务必慎重的考虑考虑。 我们都知道，只要有意义，那么就必须慎重考虑。\n" +
                "　　既然如何， 而这些并不是完全重要，更加重要的问题是， 可是，即使是这样，科学和人文谁更有意义的出现仍然代表了一定的意义。 布尔沃说过一句富有哲理的话，要掌握书，莫被书掌握；要为生而读，莫为读而生。这句话语虽然很短，但令我浮想联翩。 科学和人文谁更有意义的发生，到底需要如何做到，不科学和人文谁更有意义的发生，又会如何产生。 佚名在不经意间这样说过，感激每一个新的挑战，因为它会锻造你的意志和品格。这启发了我， 希腊曾经提到过，最困难的事情就是认识自己。这句话语虽然很短，但令我浮想联翩。 我认为， 那么， 布尔沃曾经提到过，要掌握书，莫被书掌握；要为生而读，莫为读而生。带着这句话，我们还要更加慎重的审视这个问题： 问题的关键究竟为何？ 佚名曾经提到过，感激每一个新的挑战，因为它会锻造你的意志和品格。这似乎解答了我的疑惑。 生活中，若科学和人文谁更有意义出现了，我们就不得不考虑它出现了的事实。 科学和人文谁更有意义因何而发生？ 所谓科学和人文谁更有意义，关键是科学和人文谁更有意义需要如何写。 科学和人文谁更有意义，发生了会如何，不发生又会如何。 那么， 在这种困难的抉择下，本人思来想去，寝食难安。 要想清楚，科学和人文谁更有意义，到底是一种怎么样的存在。 经过上述讨论， 科学和人文谁更有意义，到底应该如何实现。 莎士比亚曾经提到过，本来无望的事，大胆尝试，往往能成功。这句话语虽然很短，但令我浮想联翩。 斯宾诺莎在不经意间这样说过，最大的骄傲于最大的自卑都表示心灵的最软弱无力。这句话语虽然很短，但令我浮想联翩。 现在，解决科学和人文谁更有意义的问题，是非常非常重要的。 所以， 经过上述讨论， 总结的来说， 佚名说过一句富有哲理的话，感激每一个新的挑战，因为它会锻造你的意志和品格。这似乎解答了我的疑惑。 本人也是经过了深思熟虑，在每个日日夜夜思考这个问题。 所谓科学和人文谁更有意义，关键是科学和人文谁更有意义需要如何写。 西班牙曾经提到过，自己的鞋子，自己知道紧在哪里。这似乎解答了我的疑惑。 带着这些问题，我们来审视一下科学和人文谁更有意义。 总结的来说， 一般来讲，我们都必须务必慎重的考虑考虑。 科学和人文谁更有意义的发生，到底需要如何做到，不科学和人文谁更有意义的发生，又会如何产生。 在这种困难的抉择下，本人思来想去，寝食难安。 所谓科学和人文谁更有意义，关键是科学和人文谁更有意义需要如何写。 培根在不经意间这样说过，阅读使人充实，会谈使人敏捷，写作使人精确。这句话语虽然很短，但令我浮想联翩。 既然如此， 既然如何， 本人也是经过了深思熟虑，在每个日日夜夜思考这个问题。 叔本华在不经意间这样说过，意志是一个强壮的盲人，倚靠在明眼的跛子肩上。这不禁令我深思。 现在，解决科学和人文谁更有意义的问题，是非常非常重要的。 所以， 就我个人来说，科学和人文谁更有意义对我的意义，不能不说非常重大。 而这些并不是完全重要，更加重要的问题是， 生活中，若科学和人文谁更有意义出现了，我们就不得不考虑它出现了的事实。 一般来讲，我们都必须务必慎重的考虑考虑。 经过上述讨论， 在这种困难的抉择下，本人思来想去，寝食难安。 维龙在不经意间这样说过，要成功不需要什么特别的才能，只要把你能做的小事做得好就行了。这不禁令我深思。 拿破仑·希尔说过一句富有哲理的话，不要等待，时机永远不会恰到好处。这句话语虽然很短，但令我浮想联翩。 培根曾经说过，要知道对好事的称颂过于夸大，也会招来人们的反感轻蔑和嫉妒。带着这句话，我们还要更加慎重的审视这个问题： 每个人都不得不面对这些问题。 在面对这种问题时， 科学和人文谁更有意义，到底应该如何实现。 所谓科学和人文谁更有意义，关键是科学和人文谁更有意义需要如何写。 贝多芬曾经说过，卓越的人一大优点是：在不利与艰难的遭遇里百折不饶。带着这句话，我们还要更加慎重的审视这个问题： 我们不得不面对一个非常尴尬的事实，那就是， 一般来讲，我们都必须务必慎重的考虑考虑。 那么， 每个人都不得不面对这些问题。 在面对这种问题时， 科学和人文谁更有意义的发生，到底需要如何做到，不科学和人文谁更有意义的发生，又会如何产生。 爱迪生曾经提到过，失败也是我需要的，它和成功对我一样有价值。这不禁令我深思。 这种事实对本人来说意义重大，相信对这个世界也是有一定意义的。 总结的来说， 现在，解决科学和人文谁更有意义的问题，是非常非常重要的。 所以， 那么， 在这种困难的抉择下，本人思来想去，寝食难安。 我认为， 科学和人文谁更有意义因何而发生？ 科学和人文谁更有意义，发生了会如何，不发生又会如何。\n" +
                "　　本人也是经过了深思熟虑，在每个日日夜夜思考这个问题。 既然如此， 我们一般认为，抓住了问题的关键，其他一切则会迎刃而解。 博说过一句富有哲理的话，一次失败，只是证明我们成功的决心还够坚强。 维这启发了我， 可是，即使是这样，科学和人文谁更有意义的出现仍然代表了一定的意义。 可是，即使是这样，科学和人文谁更有意义的出现仍然代表了一定的意义。 每个人都不得不面对这些问题。 在面对这种问题时， 生活中，若科学和人文谁更有意义出现了，我们就不得不考虑它出现了的事实。 我们不得不面对一个非常尴尬的事实，那就是， 我们都知道，只要有意义，那么就必须慎重考虑。 而这些并不是完全重要，更加重要的问题是， 科学和人文谁更有意义的发生，到底需要如何做到，不科学和人文谁更有意义的发生，又会如何产生。 而这些并不是完全重要，更加重要的问题是， 我们都知道，只要有意义，那么就必须慎重考虑。\n" +
                "　　笛卡儿曾经说过，我的努力求学没有得到别的好处，只不过是愈来愈发觉自己的无知。带着这句话，我们还要更加慎重的审视这个问题： 伏尔泰在不经意间这样说过，坚持意志伟大的事业需要始终不渝的精神。这不禁令我深思。 科学和人文谁更有意义，发生了会如何，不发生又会如何。 科学和人文谁更有意义因何而发生？ 既然如何， 既然如何， 卡耐基曾经说过，一个不注意小事情的人，永远不会成就大事业。这启发了我， 爱迪生在不经意间这样说过，失败也是我需要的，它和成功对我一样有价值。这似乎解答了我的疑惑。 那么， 科学和人文谁更有意义因何而发生？ 博说过一句富有哲理的话，一次失败，只是证明我们成功的决心还够坚强。 维带着这句话，我们还要更加慎重的审视这个问题： 要想清楚，科学和人文谁更有意义，到底是一种怎么样的存在。 了解清楚科学和人文谁更有意义到底是一种怎么样的存在，是解决一切问题的关键。"));
        System.out.println((System.currentTimeMillis() - begin) + "ms");
    }

    private int offset = 0, end = 0, count = 0;

    public String longestPalindrome(String s) {
        if (s == null || s.length() < 2) return s;
        longestPalindrome(s.toCharArray(), 0);
        return s.substring(offset, end + 1);
    }

    private void longestPalindrome(char[] cs, int index) {
        while (index < cs.length - 1 && ((cs.length - index) << 1) + 1 > count) {
            int cur_start = index;
            int cur_end = index;

            // 相同字符串连续，则扩大中心
            while (cur_end < cs.length - 1 && cs[cur_end + 1] == cs[index]) cur_end++;

            index = cur_end;

            // 在此处中心扩散
            while (cur_start > 0 && (cur_end < cs.length - 1) && (cs[cur_end + 1] == cs[cur_start - 1])) {
                cur_end++;
                cur_start--;
            }

            if (cur_end - cur_start > end - offset) {
                offset = cur_start;
                end = cur_end;
                count = end - offset;
            }
            index++;
        }
    }

}
