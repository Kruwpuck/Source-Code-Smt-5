export default async function login(req, res){
    // TODO: call Google OAuth, generate proof
    res.status(200).json({proof: '0x...'})
}
module example::marketplace{
    use sui::object::{Self, UID};
    use sui::transfer;
    use sui::tx_context::{Self, TxContext};
    use example::nft::MyNFT;

    struct Listing has key {
        id: UID,
        nft: MyNFT,
        seller: address,
        price: u64,
    }

    public fun list_for_sale(nft: MyNFT, price: u64, ctx: &mut TxContext): Listing {
        Listing{
            id: UID::new(ctx),
            nft,
            seller: tx_context::sender(ctx),
            price,
        }
    }
    public fun buy(listing: Listing, ctx: &mut TxContext){
        let buyer = tx_context::sender(ctx);
        // Here you would typically handle the transfer of funds from buyer to seller
        // and transfer the NFT from the listing to the buyer.
        // For simplicity, we will just transfer the NFT to the buyer.
        assert!(buyer != listing.seller, 101); // Prevent seller from buying their own NFT
        transfer::transfer(listing.nft, buyer);
        // In a real implementation, you would also need to handle payment logic.
    }
}