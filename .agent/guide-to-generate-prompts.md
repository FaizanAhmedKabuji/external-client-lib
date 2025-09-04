
# Agent Instructions: Prompt Generation & Implementation

## ⚠️ MANDATORY SEQUENCE - NO EXCEPTIONS ⚠️

**YOU MUST COMPLETE THESE STEPS IN EXACT ORDER. FAILURE TO FOLLOW SEQUENCE WILL RESULT IN IMPLEMENTATION FAILURE.**

```
STEP 1: SETUP → STEP 2: CLARIFY → STEP 3: PROMPT → STEP 4: VALIDATE → STEP 5: IMPLEMENT
     ↓              ↓               ↓              ↓               ↓
  Directory      Get ALL        Create YOUR    Check ALL      Start Work
  Structure   Clarifications   Agent Prompt   Checkpoints    (Finally!)
```

**IMPLEMENTATION IS FORBIDDEN UNTIL STEPS 1-4 ARE COMPLETELY FINISHED.**

## 🚨 ENFORCEMENT PROTOCOL 🚨

**IF YOU SKIP ANY STEP OR CHECKPOINT:**
1. Your implementation WILL fail
2. You MUST restart from the beginning
3. All work done out of sequence is INVALID

**EVERY ACTION MUST BE VALIDATED:**
- Before each step: verify previous step is complete
- During implementation: continuously reference your agent prompt
- After each task: immediately update status and changelog

**YOUR AGENT PROMPT IS YOUR CONTRACT:**
- Re-read it before every implementation action
- If it's unclear, you failed at prompt creation
- If requirements change, update the prompt first

## MANDATORY DIRECTORY STRUCTURE

**YOU MUST create these directories if they don't exist:**

```
.agent/
├─ user-prompts/        # Human-written feature prompts
│   └─ <feature_name>/
│       └─ prompt.md
├─ agent-prompts/       # YOUR generated prompts
│   └─ <feature_name>/
│       └─ YYYYMMDD-prompt.md
├─ tasks/               # YOUR task breakdowns
│   └─ <feature_name>.md
└─ changelogs/          # YOUR implementation logs
    └─ <feature_name>.md
```

## MANDATORY EXECUTION SEQUENCE

**YOU MUST COMPLETE EACH STEP BEFORE PROCEEDING TO THE NEXT. NO EXCEPTIONS.**

### STEP 1: MANDATORY SETUP (CANNOT SKIP)
**CHECKPOINT 1-A: Directory Structure**
```
REQUIRED ACTION: Create these directories immediately:
- .agent/user-prompts/<feature_name>/
- .agent/agent-prompts/<feature_name>/
- .agent/tasks/
- .agent/changelogs/
```

**CHECKPOINT 1-B: User Prompt Validation**
```
REQUIRED ACTION: Verify `.agent/user-prompts/<feature_name>/prompt.md` exists
IF MISSING: STOP. Request user to provide prompt in correct location.
IF EXISTS: Parse ALL sections completely before proceeding.
```

### STEP 2: MANDATORY CLARIFICATION (CANNOT SKIP)
**CHECKPOINT 2-A: Requirement Analysis**
```
REQUIRED QUESTIONS TO ASK YOURSELF:
1. Are ALL functional requirements crystal clear?
2. Are ALL technical constraints specified?
3. Are ALL success criteria measurable?
4. Are there ANY ambiguous terms or requirements?

IF ANY ANSWER IS "NO": STOP. Generate clarification questions.
IF ALL ANSWERS ARE "YES": Proceed to prompt generation.
```

**CHECKPOINT 2-B: Clarification Questions**
```
IF CLARIFICATION NEEDED:
- Generate numbered questions using template below
- WAIT for user responses
- Update understanding document
- Re-run Checkpoint 2-A
```

### STEP 3: MANDATORY PROMPT CREATION (CANNOT SKIP)
**CHECKPOINT 3-A: Agent Prompt Generation**
```
REQUIRED ACTION: Create `.agent/agent-prompts/<feature_name>/YYYYMMDD-prompt.md`
MUST INCLUDE:
- Restated objectives from user prompt
- ALL technical constraints
- ALL functional requirements  
- Specific deliverables list
- Measurable success criteria
- Complete task breakdown

VERIFICATION: Re-read your generated prompt. Can another agent implement this without asking questions?
IF NO: Revise prompt until answer is YES.
```

**CHECKPOINT 3-B: Task List Creation**
```
REQUIRED ACTION: Create `.agent/tasks/<feature_name>.md`
MUST INCLUDE:
- Granular tasks (1-2 hours each)
- Clear acceptance criteria for each task
- Dependencies between tasks
- Validation tasks for each deliverable
```

### STEP 4: MANDATORY PRE-IMPLEMENTATION VALIDATION
**CHECKPOINT 4: Implementation Readiness**
```
VERIFICATION CHECKLIST (ALL MUST BE TRUE):
□ Directory structure created
□ User prompt fully understood
□ ALL clarifications resolved
□ Agent prompt created and verified
□ Task list created with clear criteria
□ Changelog file initialized

IF ANY BOX UNCHECKED: RETURN TO APPROPRIATE STEP
IF ALL BOXES CHECKED: Begin implementation
```

### STEP 5: IMPLEMENTATION WITH CONTINUOUS REFERENCE
**CHECKPOINT 5-A: Before Each Task**
```
MANDATORY ACTIONS BEFORE EVERY TASK:
1. Re-read your agent prompt (`.agent/agent-prompts/<feature_name>/YYYYMMDD-prompt.md`)
2. Confirm task aligns with prompt requirements
3. Check task dependencies are satisfied
```

**CHECKPOINT 5-B: After Each Task**
```
MANDATORY ACTIONS AFTER EVERY TASK:
1. Update task status: `- [x] Task description (YYYY-MM-DD)`
2. Log change in changelog with specific details
3. Verify deliverable meets acceptance criteria
```

### STEP 6: CONTINUOUS VALIDATION
**CHECKPOINT 6: Progress Validation**
```
AFTER EVERY 3 COMPLETED TASKS:
1. Re-read agent prompt
2. Verify implementation still aligns with requirements
3. Update changelog with progress summary
4. Check for any new blockers or questions
```

## REQUIRED TEMPLATES

### Agent Prompt Template
```markdown
# Agent Implementation Prompt: <Feature Name>

## OBJECTIVE
[Restate what you must build and why]

## TECHNICAL CONSTRAINTS
- Stack: [specific technologies]
- Performance: [specific targets]
- Standards: [coding conventions, patterns]
- APIs: [rate limits, authentication]
- Dependencies: [versions, compatibility]

## IMPLEMENTATION REQUIREMENTS
- [Specific functional requirement 1]
- [Specific functional requirement 2]
- [Non-functional requirement 1]

## DELIVERABLES
- [Specific files/components to create]
- [Specific modifications to make]
- [Specific tests to write]

## SUCCESS CRITERIA
- [Measurable completion criteria]
- [Acceptance criteria]

## YOUR TASKS
- [ ] Task 1 – specific action
- [ ] Task 2 – specific action
- [ ] Task 3 – specific action
```

### Task List Template
```markdown
# Tasks: <Feature Name>

## Status Legend
- [ ] Not started
- [x] Complete (YYYY-MM-DD)
- [x] BLOCKED: reason

## Implementation Tasks
- [ ] Task 1 – description
- [ ] Task 2 – description
- [ ] Task 3 – description

## Validation Tasks
- [ ] Test 1 – description
- [ ] Test 2 – description

## Documentation Tasks
- [ ] Document 1 – description
- [ ] Document 2 – description
```

### Changelog Template
```markdown
# Changelog: <Feature Name>

## YYYY-MM-DD
- [Action] Brief description
- Files: list of affected files
- Tasks: completed task references

## YYYY-MM-DD
- [Action] Brief description
- Files: list of affected files
- Tasks: completed task references
```

## COMMUNICATION PROTOCOLS

### When to Ask Questions
- User prompt contains ambiguous requirements
- Multiple valid implementation approaches exist
- Technical constraints conflict with requirements
- Missing critical information (APIs, credentials, etc.)

### Mandatory Clarification Template
```
⚠️  IMPLEMENTATION BLOCKED - CLARIFICATION REQUIRED ⚠️

I have analyzed the user prompt and identified ambiguities that must be resolved before proceeding.

REQUIREMENTS ANALYSIS:
✅ Clear requirements: [list clear requirements]
❌ Unclear requirements: [list unclear requirements]

MANDATORY CLARIFICATION QUESTIONS:

1. [Specific question about unclear requirement A]
   - Context: [why this is unclear]
   - Impact: [how this affects implementation]

2. [Specific question about unclear requirement B]
   - Context: [why this is unclear]  
   - Impact: [how this affects implementation]

3. [Specific question about technical constraint C]
   - Context: [why this needs clarification]
   - Impact: [implementation implications]

IMPLEMENTATION WILL NOT BEGIN UNTIL ALL QUESTIONS ARE ANSWERED.

Please provide specific, detailed answers to proceed with agent prompt generation.
```

### Options Format
```
Multiple implementation approaches are possible:

1. Approach A – [brief description, pros/cons]
2. Approach B – [brief description, pros/cons]
3. Approach C – [brief description, pros/cons]

Which approach should I implement?
```

## CRITICAL ENFORCEMENT RULES

### IMMEDIATE STOP CONDITIONS
**THE AGENT MUST STOP IMMEDIATELY IF:**
- Directory structure is not created
- User prompt is missing or incomplete
- Any clarification questions remain unanswered
- Agent prompt has not been generated
- Task list has not been created
- Any checkpoint verification fails

### MANDATORY REFERENCE PROTOCOL
**BEFORE EVERY IMPLEMENTATION ACTION:**
1. **MUST** re-read `.agent/agent-prompts/<feature_name>/YYYYMMDD-prompt.md`
2. **MUST** verify current action aligns with prompt requirements
3. **MUST** check task status and dependencies

### TASK UPDATE ENFORCEMENT
**AFTER EVERY COMPLETED TASK:**
1. **IMMEDIATELY** update task status with completion date
2. **IMMEDIATELY** log change in changelog with specifics
3. **IMMEDIATELY** verify deliverable quality

### CLARIFICATION ENFORCEMENT
**WHEN ANY REQUIREMENT IS UNCLEAR:**
```
STOP ALL IMPLEMENTATION WORK
GENERATE CLARIFICATION REQUEST
WAIT FOR USER RESPONSE
UPDATE AGENT PROMPT WITH CLARIFICATIONS
RESTART FROM CHECKPOINT 4
```

### PROMPT CREATION VERIFICATION
**YOUR AGENT PROMPT MUST PASS THIS TEST:**
```
Can another agent implement this feature using ONLY your agent prompt 
without asking any clarification questions?

IF NO: Revise prompt until answer is YES
IF YES: Proceed to implementation
```

## ERROR HANDLING

### If User Prompt is Missing:
1. Create the directory structure
2. Ask user to provide the prompt in the correct location
3. Wait for prompt before proceeding

### If Requirements are Ambiguous:
1. Stop implementation
2. Generate numbered questions
3. Wait for clarification
4. Update your agent prompt with clarified requirements

### If Task Becomes Impossible:
1. Mark task as `[x] BLOCKED: specific reason`
2. Document the blocker in changelog
3. Ask for alternative approach or requirement modification

## VALIDATION CHECKLIST

### Checkpoint 1: Setup Validation
```
BEFORE PROCEEDING TO STEP 2:
□ .agent/ directory exists
□ .agent/user-prompts/<feature_name>/ exists
□ .agent/agent-prompts/<feature_name>/ exists  
□ .agent/tasks/ exists
□ .agent/changelogs/ exists
□ User prompt file exists and is readable
□ All sections of user prompt have been parsed

IF ANY BOX UNCHECKED: STOP. Complete setup first.
```

### Checkpoint 2: Clarification Validation
```
BEFORE PROCEEDING TO STEP 3:
□ All functional requirements are crystal clear
□ All technical constraints are specified
□ All success criteria are measurable
□ No ambiguous terms remain
□ All clarification questions have been answered
□ User responses have been documented

IF ANY BOX UNCHECKED: STOP. Get clarifications first.
```

### Checkpoint 3: Prompt Creation Validation
```
BEFORE PROCEEDING TO STEP 4:
□ Agent prompt file created with correct naming
□ Objective section clearly restates user requirements
□ Technical constraints section is complete
□ Implementation requirements are specific and actionable
□ Deliverables are clearly defined
□ Success criteria are measurable
□ Task breakdown is included
□ Another agent could implement using only this prompt

IF ANY BOX UNCHECKED: STOP. Fix agent prompt first.
```

### Checkpoint 4: Implementation Readiness
```
BEFORE STARTING ANY IMPLEMENTATION:
□ All previous checkpoints passed
□ Task list created with granular tasks
□ Each task has clear acceptance criteria
□ Dependencies between tasks identified
□ Changelog file initialized
□ Agent prompt has been re-read and understood

IF ANY BOX UNCHECKED: STOP. Complete preparation first.
```

### Checkpoint 5: Continuous Implementation Validation
```
BEFORE EACH TASK:
□ Agent prompt re-read
□ Task aligns with prompt requirements
□ Dependencies satisfied
□ Clear acceptance criteria understood

AFTER EACH TASK:
□ Task status updated with completion date
□ Changelog updated with specific changes
□ Deliverable meets acceptance criteria
□ No blockers identified
```

Before marking a feature complete, verify:
- [ ] All checkpoints have been completed in sequence
- [ ] All tasks marked as complete with dates
- [ ] All deliverables created and verified
- [ ] Success criteria met and documented
- [ ] Changelog contains complete implementation history
- [ ] No blocked tasks remain unresolved
- [ ] Agent prompt was referenced throughout implementation

## TEMPLATE CUSTOMIZATION

Adapt templates based on project type:
- **Web Applications**: Include frontend/backend separation
- **APIs**: Include endpoint specifications, authentication
- **Data Processing**: Include input/output schemas, performance metrics
- **Integrations**: Include third-party API requirements, error handling

Remember: This guide is your instruction manual. Follow it precisely to ensure consistent, high-quality implementations.