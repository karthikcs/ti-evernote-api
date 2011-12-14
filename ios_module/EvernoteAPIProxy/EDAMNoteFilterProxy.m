#import "EDAMNoteFilterProxy.h"
#import "TiUtils.h"
#import "TiThriftUtils.h"



#import "JpMasuidriveTiEvernoteapiModule.h"

@interface JpMasuidriveTiEvernoteapiModule(EDAMNoteFilter)
-(id)createNoteFilter:(id)args;
@end

@implementation JpMasuidriveTiEvernoteapiModule(EDAMNoteFilter)
-(id)createNoteFilter:(id)args
{
    return [[[EDAMNoteFilterProxy alloc] initWithObject: [[[EDAMNoteFilter alloc] init] autorelease]] autorelease];
}
@end


@implementation EDAMNoteFilterProxy
@synthesize object;


-(id)order
{
    return NUMINT(object.order);
}

-(void)setOrder:(id)value
{
    object.order = [value integerValue];
}


-(id)ascending
{
    return NUMBOOL(object.ascending);
}

-(void)setAscending:(id)value
{
    object.ascending = [value boolValue];
}


-(id)words
{
    return object.words;
}

-(void)setWords:(id)value
{
    object.words = [TiUtils stringValue:value];
}


-(id)notebookGuid
{
    return object.notebookGuid;
}

-(void)setNotebookGuid:(id)value
{
    object.notebookGuid = [TiUtils stringValue:value];
}


-(id)tagGuids
{
    return arrayMap(object.tagGuids, ^(id item) { return item; });
}

-(void)setTagGuids:(id)value
{
    object.tagGuids = arrayMap(value, ^(id item) { return item; });
}


-(id)timeZone
{
    return object.timeZone;
}

-(void)setTimeZone:(id)value
{
    object.timeZone = [TiUtils stringValue:value];
}


-(id)inactive
{
    return NUMBOOL(object.inactive);
}

-(void)setInactive:(id)value
{
    object.inactive = [value boolValue];
}



- (id)initWithObject:(EDAMNoteFilter*)object_
{
    if(self = [super init]){
        self.object = object_;
    }
    return self;
}

- (void)dealloc
{
    self.object = nil;
    [super release];
}
@end
